package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object BottomNavigationButton {

  @JSImport("material-ui", "BottomNavigationButton")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props[A] extends ButtonBase.Props {
    var icon: js.UndefOr[String | ReactElement] = js.native
    var label: js.UndefOr[String | ReactElement] = js.native
    var showLabel: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[A] = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object selected extends ClassKey("selected")
  object selectedIconOnly extends ClassKey("selectedIconOnly")
  object wrapper extends ClassKey("wrapper")
  object label extends ClassKey("label")
  object selectedLabel extends ClassKey("selectedLabel")
  object hiddenLabel extends ClassKey("hiddenLabel")
  object icon extends ClassKey("icon")

  private def component[A] = JsComponent[Props[A], Children.Varargs, Null](RawComponent)

  def apply[A](
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      icon:                     js.UndefOr[String | ReactElement] = js.undefined,
      label:                    js.UndefOr[String | ReactElement] = js.undefined,
      onChange:                 Handler2[ReactEvent, A]           = js.undefined,
      onClick:                  Handler1[ReactMouseEvent]         = js.undefined,
      selected:                 js.UndefOr[Boolean]               = js.undefined,
      showLabel:                js.UndefOr[Boolean]               = js.undefined,
      value:                    js.UndefOr[A]                     = js.undefined,
      centerRipple:             Boolean                           = false,
      disableRipple:            Boolean                           = false,
      focusRipple:              Boolean                           = false,
      keyboardFocusedClassName: js.UndefOr[String]                = js.undefined,
      onBlur:                   Handler1[ReactEvent]              = js.undefined,
      onFocus:                  Handler1[ReactFocusEvent]         = js.undefined,
      onKeyboardFocus:          Handler1[ReactFocusEvent]         = js.undefined,
      onKeyDown:                Handler1[ReactKeyboardEvent]      = js.undefined,
      onKeyUp:                  Handler1[ReactKeyboardEvent]      = js.undefined,
      onMouseDown:              Handler1[ReactMouseEvent]         = js.undefined,
      onMouseLeave:             Handler1[ReactMouseEvent]         = js.undefined,
      onMouseUp:                Handler1[ReactMouseEvent]         = js.undefined,
      onTouchEnd:               Handler1[ReactTouchEvent]         = js.undefined,
      onTouchMove:              Handler1[ReactTouchEvent]         = js.undefined,
      onTouchStart:             Handler1[ReactTouchEvent]         = js.undefined,
      role:                     js.UndefOr[String]                = js.undefined)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props[A]]
    p.icon = icon
    p.classes = classes
    p.label = label
    p.showLabel = showLabel
    p.onClick = onClick
    p.value = value
    p.centerRipple = centerRipple
    p.classes = classes
    p.className = className
    p.disableRipple = disableRipple
    p.focusRipple = focusRipple
    p.keyboardFocusedClassName = keyboardFocusedClassName
    p.onBlur = onBlur
    p.onClick = onClick
    p.onFocus = onFocus
    p.onKeyboardFocus = onKeyboardFocus
    p.onKeyDown = onKeyDown
    p.onKeyUp = onKeyUp
    p.onMouseDown = onMouseDown
    p.onMouseLeave = onMouseLeave
    p.onMouseUp = onMouseUp
    p.onTouchEnd = onTouchEnd
    p.onTouchMove = onTouchMove
    p.onTouchStart = onTouchStart
    p.role = role
    this.component[A](p)(children: _*)
  }
}
