package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Button {

  @JSImport("material-ui", "Button")
  @js.native
  private object RawComponent extends js.Object

  abstract case class Color(get: String) extends StringType
  object default extends Color("default")
  object inherit extends Color("inherit")
  object primary extends Color("primary")
  object accent extends Color("accent")
  object contrast extends Color("contrast")

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var color: String = js.native
    var dense: Boolean = js.native
    var disableFocusRipple: Boolean = js.native
    var fab: Boolean = js.native
    var href: js.UndefOr[String] = js.native
    var mini: Boolean = js.native
    var raised: Boolean = js.native
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
      color:                    String,
      dense:                    Boolean,
      disableFocusRipple:       Boolean,
      fab:                      Boolean,
      href:                     js.UndefOr[String],
      mini:                     Boolean,
      raised:                   Boolean,
      otherProps:               (String, js.Any)*
  ): Props = {
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
      tabIndex                 = tabIndex,
      color                    = color,
      dense                    = dense,
      disableFocusRipple       = disableFocusRipple,
      fab                      = fab,
      href                     = href,
      mini                     = mini,
      raised                   = raised
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object dense extends ClassKey("dense")
  object label extends ClassKey("label")
  object flatPrimary extends ClassKey("flatPrimary")
  object flatAccent extends ClassKey("flatAccent")
  object flatContrast extends ClassKey("flatContrast")
  object colorInherit extends ClassKey("colorInherit")
  object raised extends ClassKey("raised")
  object keyboardFocused extends ClassKey("keyboardFocused")
  object raisedPrimary extends ClassKey("raisedPrimary")
  object raisedAccent extends ClassKey("raisedAccent")
  object raisedContrast extends ClassKey("raisedContrast")
  object disabled extends ClassKey("disabled")
  object fab extends ClassKey("fab")
  object mini extends ClassKey("mini")

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      color:                    Color                             = default,
      dense:                    Boolean                           = false,
      disableFocusRipple:       Boolean                           = false,
      fab:                      Boolean                           = false,
      href:                     js.UndefOr[String]                = js.undefined,
      mini:                     Boolean                           = false,
      raised:                   Boolean                           = false,
      centerRipple:             Boolean                           = false,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      component:                String | ReactElement             = "button",
      disableRipple:            Boolean                           = false,
      disabled:                 Boolean                           = false,
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
      tabIndex:                 js.UndefOr[Int | String]          = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
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
      color,
      dense,
      disableFocusRipple,
      fab,
      href,
      mini,
      raised,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
