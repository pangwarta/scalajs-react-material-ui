package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ButtonBase {

  @JSImport("material-ui", "ButtonBase")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var centerRipple: Boolean = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: String | ReactElement = js.native
    var disableRipple: Boolean = js.native
    var disabled: Boolean = js.native
    var focusRipple: Boolean = js.native
    var keyboardFocusedClassName: js.UndefOr[String] = js.native
    var onBlur: OnJS1[ReactEvent] = js.native
    var onClick: OnJS1[ReactMouseEvent] = js.native
    var onFocus: OnJS1[ReactFocusEvent] = js.native
    var onKeyboardFocus: OnJS1[ReactFocusEvent] = js.native
    var onKeyDown: OnJS1[ReactKeyboardEvent] = js.native
    var onKeyUp: OnJS1[ReactKeyboardEvent] = js.native
    var onMouseDown: OnJS1[ReactMouseEvent] = js.native
    var onMouseLeave: OnJS1[ReactMouseEvent] = js.native
    var onMouseUp: OnJS1[ReactMouseEvent] = js.native
    var onTouchEnd: OnJS1[ReactTouchEvent] = js.native
    var onTouchMove: OnJS1[ReactTouchEvent] = js.native
    var onTouchStart: OnJS1[ReactTouchEvent] = js.native
    var role: js.UndefOr[String] = js.native
    var tabIndex: Int | String = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object disabled extends ClassKey("disabled")

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      centerRipple:             Boolean                      = false,
      classes:                  Map[ClassKey, String]        = Map.empty,
      className:                js.UndefOr[String]           = js.undefined,
      component:                String | ReactElement,
      disableRipple:            Boolean                      = false,
      disabled:                 Boolean,
      focusRipple:              Boolean                      = false,
      keyboardFocusedClassName: js.UndefOr[String]           = js.undefined,
      onBlur:                   Handler1[ReactEvent]         = js.undefined,
      onClick:                  Handler1[ReactMouseEvent]    = js.undefined,
      onFocus:                  Handler1[ReactFocusEvent]    = js.undefined,
      onKeyboardFocus:          Handler1[ReactFocusEvent]    = js.undefined,
      onKeyDown:                Handler1[ReactKeyboardEvent] = js.undefined,
      onKeyUp:                  Handler1[ReactKeyboardEvent] = js.undefined,
      onMouseDown:              Handler1[ReactMouseEvent]    = js.undefined,
      onMouseLeave:             Handler1[ReactMouseEvent]    = js.undefined,
      onMouseUp:                Handler1[ReactMouseEvent]    = js.undefined,
      onTouchEnd:               Handler1[ReactTouchEvent]    = js.undefined,
      onTouchMove:              Handler1[ReactTouchEvent]    = js.undefined,
      onTouchStart:             Handler1[ReactTouchEvent]    = js.undefined,
      role:                     js.UndefOr[String]           = js.undefined,
      tabIndex:                 Int | String)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.centerRipple = centerRipple
    p.classes = classes
    p.className = className
    p.component = component
    p.disableRipple = disableRipple
    p.disabled = disabled
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
    p.tabIndex = tabIndex
    this.component(p)(children: _*)
  }
}
