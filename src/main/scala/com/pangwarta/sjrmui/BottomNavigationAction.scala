package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object BottomNavigationAction {

  @JSImport("material-ui", "BottomNavigationAction")
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
      centerRipple:             js.UndefOr[Boolean],
      classes:                  js.Dictionary[String],
      className:                js.UndefOr[String],
      disableRipple:            js.UndefOr[Boolean],
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
      icon:                     js.UndefOr[String | ReactElement],
      label:                    js.UndefOr[String | ReactElement],
      onChange:                 OnJSEv2[ReactEvent, A],
      showLabel:                js.UndefOr[Boolean],
      value:                    js.UndefOr[A],
      otherProps:               (String, js.Any)*
  ): Props[A] = {
    val p = js.Dynamic.literal(classes = classes)
    centerRipple.foreach(v => p.updateDynamic("centerRipple")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    disableRipple.foreach(v => p.updateDynamic("disableRipple")(v))
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
    icon.foreach(v => p.updateDynamic("icon")(v))
    label.foreach(v => p.updateDynamic("label")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    showLabel.foreach(v => p.updateDynamic("showLabel")(v))
    value.foreach(v => p.updateDynamic("value")(v.asInstanceOf[js.Any]))
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
      centerRipple:             js.UndefOr[Boolean]               = false,
      classes:                  Map[ClassKey, String]             = Map.empty,
      className:                js.UndefOr[String]                = js.undefined,
      icon:                     js.UndefOr[String | ReactElement] = js.undefined,
      label:                    js.UndefOr[String | ReactElement] = js.undefined,
      onChange:                 ReactHandler2[ReactEvent, A]      = js.undefined,
      onClick:                  ReactHandler1[ReactMouseEvent]    = js.undefined,
      selected:                 js.UndefOr[Boolean]               = js.undefined,
      showLabel:                js.UndefOr[Boolean]               = js.undefined,
      value:                    js.UndefOr[A]                     = js.undefined,
      disableRipple:            js.UndefOr[Boolean]               = false,
      focusRipple:              js.UndefOr[Boolean]               = false,
      keyboardFocusedClassName: js.UndefOr[String]                = js.undefined,
      onBlur:                   ReactHandler1[ReactEvent]         = js.undefined,
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
      role:                     js.UndefOr[String]                = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
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
      onChange,
      showLabel,
      value,
      otherProps: _*
    )
    this.component[A](p)(children: _*)
  }
}
