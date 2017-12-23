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

  private def props[A](
      centerRipple:             Boolean,
      classes:                  js.Dictionary[String],
      className:                js.UndefOr[String],
      disableRipple:            Boolean,
      focusRipple:              Boolean,
      keyboardFocusedClassName: js.UndefOr[String],
      onBlur:                   OnJS1[ReactEvent],
      onClick:                  OnJS1[ReactMouseEvent],
      onFocus:                  OnJS1[ReactFocusEvent],
      onKeyboardFocus:          OnJS1[ReactFocusEvent],
      onKeyDown:                OnJS1[ReactKeyboardEvent],
      onKeyUp:                  OnJS1[ReactKeyboardEvent],
      onMouseDown:              OnJS1[ReactMouseEvent],
      onMouseLeave:             OnJS1[ReactMouseEvent],
      onMouseUp:                OnJS1[ReactMouseEvent],
      onTouchEnd:               OnJS1[ReactTouchEvent],
      onTouchMove:              OnJS1[ReactTouchEvent],
      onTouchStart:             OnJS1[ReactTouchEvent],
      role:                     js.UndefOr[String],
      icon:                     js.UndefOr[String | ReactElement],
      label:                    js.UndefOr[String | ReactElement],
      showLabel:                js.UndefOr[Boolean],
      value:                    js.UndefOr[A],
      otherProps:               (String, js.Any)*): Props[A] = {
    val p = js.Dynamic.literal(
      centerRipple             = centerRipple,
      classes                  = classes,
      className                = className,
      disableRipple            = disableRipple,
      focusRipple              = focusRipple,
      keyboardFocusedClassName = keyboardFocusedClassName,
      onBlur                   = onBlur,
      onClick                  = onClick,
      onFocus                  = onFocus,
      onKeyboardFocus          = onKeyboardFocus,
      onKeyDown                = onKeyDown,
      onKeyUp                  = onKeyUp,
      onMouseDown              = onMouseDown,
      onMouseLeave             = onMouseLeave,
      onMouseUp                = onMouseUp,
      onTouchEnd               = onTouchEnd,
      onTouchMove              = onTouchMove,
      onTouchStart             = onTouchStart,
      role                     = role,
      icon                     = icon,
      label                    = label,
      showLabel                = showLabel,
      value                    = value.asInstanceOf[js.Any])
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props[A]]
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
      centerRipple:             Boolean                           = false,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      icon:                     js.UndefOr[String | ReactElement] = js.undefined,
      label:                    js.UndefOr[String | ReactElement] = js.undefined,
      onChange:                 Handler2[ReactEvent, A]           = js.undefined,
      onClick:                  Handler1[ReactMouseEvent]         = js.undefined,
      selected:                 js.UndefOr[Boolean]               = js.undefined,
      showLabel:                js.UndefOr[Boolean]               = js.undefined,
      value:                    js.UndefOr[A]                     = js.undefined,
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
      role:                     js.UndefOr[String]                = js.undefined)(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      centerRipple,
      classes,
      className,
      disableRipple,
      focusRipple,
      keyboardFocusedClassName,
      onBlur,
      onClick,
      onFocus,
      onKeyboardFocus,
      onKeyDown,
      onKeyUp,
      onMouseDown,
      onMouseLeave,
      onMouseUp,
      onTouchEnd,
      onTouchMove,
      onTouchStart,
      role,
      icon,
      label,
      showLabel,
      value,
      otherProps: _*)
    this.component[A](p)(children: _*)
  }
}
