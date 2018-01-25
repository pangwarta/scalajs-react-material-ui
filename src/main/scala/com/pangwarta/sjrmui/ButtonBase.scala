package com.pangwarta.sjrmui

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
      centerRipple:             js.UndefOr[Boolean],
      classes:                  js.Dictionary[String],
      className:                js.UndefOr[String],
      component:                js.UndefOr[String | ReactElement],
      disableRipple:            js.UndefOr[Boolean],
      disabled:                 js.UndefOr[Boolean],
      focusRipple:              js.UndefOr[Boolean],
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
      otherProps:               (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    centerRipple.foreach(v => p.updateDynamic("centerRipple")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    component.foreach(v => p.updateDynamic("component")(v))
    disableRipple.foreach(v => p.updateDynamic("disableRipple")(v))
    disabled.foreach(v => p.updateDynamic("disabled")(v))
    focusRipple.foreach(v => p.updateDynamic("focusRipple")(v))
    keyboardFocusedClassName.foreach(v => p.updateDynamic("keyboardFocusedClassName")(v))
    onBlur.foreach(v => p.updateDynamic("onBlur")(v))
    onClick.foreach(v => p.updateDynamic("onClick")(v))
    onFocus.foreach(v => p.updateDynamic("onFocus")(v))
    onKeyboardFocus.foreach(v => p.updateDynamic("onKeyboardFocus")(v))
    onKeyDown.foreach(v => p.updateDynamic("onKeyDown")(v))
    onKeyUp.foreach(v => p.updateDynamic("onKeyUp")(v))
    onMouseDown.foreach(v => p.updateDynamic("onMouseDown")(v))
    onMouseLeave.foreach(v => p.updateDynamic("onMouseLeave")(v))
    onMouseUp.foreach(v => p.updateDynamic("onMouseUp")(v))
    onTouchEnd.foreach(v => p.updateDynamic("onTouchEnd")(v))
    onTouchMove.foreach(v => p.updateDynamic("onTouchMove")(v))
    onTouchStart.foreach(v => p.updateDynamic("onTouchStart")(v))
    role.foreach(v => p.updateDynamic("role")(v))
    tabIndex.foreach(v => p.updateDynamic("tabIndex")(v))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object disabled extends ClassKey("disabled")

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      centerRipple:             js.UndefOr[Boolean]               = false,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      component:                js.UndefOr[String | ReactElement],
      disableRipple:            js.UndefOr[Boolean]               = false,
      disabled:                 js.UndefOr[Boolean]               = js.undefined,
      focusRipple:              js.UndefOr[Boolean]               = false,
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
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
