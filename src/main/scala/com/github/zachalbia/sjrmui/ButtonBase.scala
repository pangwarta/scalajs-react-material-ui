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
    var onBlur: OnJSEv1[ReactEvent] = js.native
    var onClick: OnJSEv1[ReactMouseEvent] = js.native
    var onFocus: OnJSEv1[ReactFocusEvent] = js.native
    var onKeyboardFocus: OnJSEv1[ReactFocusEvent] = js.native
    var onKeyDown: OnJSEv1[ReactKeyboardEvent] = js.native
    var onKeyUp: OnJSEv1[ReactKeyboardEvent] = js.native
    var onMouseDown: OnJSEv1[ReactMouseEvent] = js.native
    var onMouseLeave: OnJSEv1[ReactMouseEvent] = js.native
    var onMouseUp: OnJSEv1[ReactMouseEvent] = js.native
    var onTouchEnd: OnJSEv1[ReactTouchEvent] = js.native
    var onTouchMove: OnJSEv1[ReactTouchEvent] = js.native
    var onTouchStart: OnJSEv1[ReactTouchEvent] = js.native
    var role: js.UndefOr[String] = js.native
    var tabIndex: js.UndefOr[Int | String] = js.native
  }

  private def props(
      centerRipple:             Boolean,
      classes:                  js.Dictionary[String],
      className:                js.UndefOr[String],
      component:                String | ReactElement,
      disableRipple:            Boolean,
      disabled:                 Boolean,
      focusRipple:              Boolean,
      keyboardFocusedClassName: js.UndefOr[String],
      onBlur:                   OnJSEv1[ReactEvent],
      onClick:                  OnJSEv1[ReactMouseEvent],
      onFocus:                  OnJSEv1[ReactFocusEvent],
      onKeyboardFocus:          OnJSEv1[ReactFocusEvent],
      onKeyDown:                OnJSEv1[ReactKeyboardEvent],
      onKeyUp:                  OnJSEv1[ReactKeyboardEvent],
      onMouseDown:              OnJSEv1[ReactMouseEvent],
      onMouseLeave:             OnJSEv1[ReactMouseEvent],
      onMouseUp:                OnJSEv1[ReactMouseEvent],
      onTouchEnd:               OnJSEv1[ReactTouchEvent],
      onTouchMove:              OnJSEv1[ReactTouchEvent],
      onTouchStart:             OnJSEv1[ReactTouchEvent],
      role:                     js.UndefOr[String],
      tabIndex:                 js.UndefOr[Int | String],
      otherProps:               (String, js.Any)*): Props = {
    val p = js.Dynamic.literal(
      centerRipple             = centerRipple,
      classes                  = classes,
      className                = className,
      component                = component,
      disableRipple            = disableRipple,
      disabled                 = disabled,
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
      tabIndex                 = tabIndex)
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object disabled extends ClassKey("disabled")

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      centerRipple:             Boolean                           = false,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      component:                String | ReactElement,
      disableRipple:            Boolean                           = false,
      disabled:                 Boolean,
      focusRipple:              Boolean                           = false,
      keyboardFocusedClassName: js.UndefOr[String]                = js.undefined,
      onBlur:                   ReactHandler1[ReactEvent]         = js.undefined,
      onClick:                  ReactHandler1[ReactMouseEvent]    = js.undefined,
      onFocus:                  ReactHandler1[ReactFocusEvent]    = js.undefined,
      onKeyboardFocus:          ReactHandler1[ReactFocusEvent]    = js.undefined,
      onKeyDown:                ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onKeyUp:                  ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onMouseDown:              ReactHandler1[ReactMouseEvent]    = js.undefined,
      onMouseLeave:             ReactHandler1[ReactMouseEvent]    = js.undefined,
      onMouseUp:                ReactHandler1[ReactMouseEvent]    = js.undefined,
      onTouchEnd:               ReactHandler1[ReactTouchEvent]    = js.undefined,
      onTouchMove:              ReactHandler1[ReactTouchEvent]    = js.undefined,
      onTouchStart:             ReactHandler1[ReactTouchEvent]    = js.undefined,
      role:                     js.UndefOr[String]                = js.undefined,
      tabIndex:                 js.UndefOr[Int | String]          = js.undefined)(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      centerRipple,
      classes,
      className,
      component,
      disableRipple,
      disabled,
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
      tabIndex,
      otherProps: _*)
    this.component(p)(children: _*)
  }
}
