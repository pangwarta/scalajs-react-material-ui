package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{
  Children,
  JsComponent,
  ReactEvent,
  ReactFocusEvent,
  ReactKeyboardEvent,
  ReactMouseEvent,
  ReactTouchEvent
}

import scala.language.higherKinds
import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Button {

  def apply(
    centerRipple: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    focusRipple: js.UndefOr[Boolean] = js.undefined,
    keyboardFocusedClassName: js.UndefOr[String] = js.undefined,
    onBlur: ReactHandler1[ReactEvent] = js.undefined,
    onClick: ReactHandler1[ReactMouseEvent] = js.undefined,
    onFocus: ReactHandler1[ReactFocusEvent] = js.undefined,
    onKeyboardFocus: ReactHandler1[ReactFocusEvent] = js.undefined,
    onKeyDown: ReactHandler1[ReactKeyboardEvent] = js.undefined,
    onKeyUp: ReactHandler1[ReactKeyboardEvent] = js.undefined,
    onMouseDown: ReactHandler1[ReactMouseEvent] = js.undefined,
    onMouseLeave: ReactHandler1[ReactMouseEvent] = js.undefined,
    onMouseUp: ReactHandler1[ReactMouseEvent] = js.undefined,
    onTouchEnd: ReactHandler1[ReactTouchEvent] = js.undefined,
    onTouchMove: ReactHandler1[ReactTouchEvent] = js.undefined,
    onTouchStart: ReactHandler1[ReactTouchEvent] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    tabIndex: js.UndefOr[Int | String] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disableFocusRipple: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    href: js.UndefOr[String] = js.undefined,
    mini: js.UndefOr[Boolean] = js.undefined,
    size: js.UndefOr[Size] = js.undefined,
    variant: js.UndefOr[Variant] = js.undefined
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
      fullWidth,
      href,
      mini,
      size,
      variant,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    centerRipple: js.UndefOr[Boolean],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    component: js.UndefOr[String | ReactElement],
    disableRipple: js.UndefOr[Boolean],
    disabled: js.UndefOr[Boolean],
    focusRipple: js.UndefOr[Boolean],
    keyboardFocusedClassName: js.UndefOr[String],
    onBlur: OnJSEv1[ReactEvent],
    onClick: OnJSEv1[ReactMouseEvent],
    onFocus: OnJSEv1[ReactFocusEvent],
    onKeyboardFocus: OnJSEv1[ReactFocusEvent],
    onKeyDown: OnJSEv1[ReactKeyboardEvent],
    onKeyUp: OnJSEv1[ReactKeyboardEvent],
    onMouseDown: OnJSEv1[ReactMouseEvent],
    onMouseLeave: OnJSEv1[ReactMouseEvent],
    onMouseUp: OnJSEv1[ReactMouseEvent],
    onTouchEnd: OnJSEv1[ReactTouchEvent],
    onTouchMove: OnJSEv1[ReactTouchEvent],
    onTouchStart: OnJSEv1[ReactTouchEvent],
    role: js.UndefOr[String],
    tabIndex: js.UndefOr[Int | String],
    color: js.UndefOr[String],
    dense: js.UndefOr[Boolean],
    disableFocusRipple: js.UndefOr[Boolean],
    fullWidth: js.UndefOr[Boolean],
    href: js.UndefOr[String],
    mini: js.UndefOr[Boolean],
    size: js.UndefOr[String],
    variant: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    centerRipple.foreach(p.updateDynamic("centerRipple")(_))
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disableRipple.foreach(p.updateDynamic("disableRipple")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    focusRipple.foreach(p.updateDynamic("focusRipple")(_))
    keyboardFocusedClassName.foreach(p.updateDynamic("keyboardFocusedClassName")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onClick.foreach(p.updateDynamic("onClick")(_))
    onFocus.foreach(p.updateDynamic("onFocus")(_))
    onKeyboardFocus.foreach(p.updateDynamic("onKeyboardFocus")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    onKeyUp.foreach(p.updateDynamic("onKeyUp")(_))
    onMouseDown.foreach(p.updateDynamic("onMouseDown")(_))
    onMouseLeave.foreach(p.updateDynamic("onMouseLeave")(_))
    onMouseUp.foreach(p.updateDynamic("onMouseUp")(_))
    onTouchEnd.foreach(p.updateDynamic("onTouchEnd")(_))
    onTouchMove.foreach(p.updateDynamic("onTouchMove")(_))
    onTouchStart.foreach(p.updateDynamic("onTouchStart")(_))
    role.foreach(p.updateDynamic("role")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
    color.foreach(p.updateDynamic("color")(_))
    dense.foreach(p.updateDynamic("dense")(_))
    disableFocusRipple.foreach(p.updateDynamic("disableFocusRipple")(_))
    fullWidth.foreach(p.updateDynamic("fullWidth")(_))
    href.foreach(p.updateDynamic("href")(_))
    mini.foreach(p.updateDynamic("mini")(_))
    size.foreach(p.updateDynamic("size")(_))
    variant.foreach(p.updateDynamic("variant")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var color: js.UndefOr[String]               = js.native
    var dense: js.UndefOr[Boolean]              = js.native
    var disableFocusRipple: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean]          = js.native
    var href: js.UndefOr[String]                = js.native
    var mini: js.UndefOr[Boolean]               = js.native
    var size: js.UndefOr[String]                = js.native
    var variant: js.UndefOr[String]             = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  abstract case class Color(get: String) extends StringType

  abstract case class Size(get: String) extends StringType

  abstract case class Variant(get: String) extends StringType

  object Color {
    object default  extends Color("default")
    object inherit  extends Color("inherit")
    object primary  extends Color("primary")
    object accent   extends Color("accent")
    object contrast extends Color("contrast")
  }

  object Size {
    object small  extends Size("small")
    object medium extends Size("medium")
    object large  extends Size("large")
  }

  object Variant {
    object flat   extends Variant("flat")
    object raised extends Variant("raised")
    object fab    extends Variant("fab")
  }

  object root                                      extends ClassKey("root")

  object dense                                     extends ClassKey("dense")

  object label                                     extends ClassKey("label")

  object flatPrimary                               extends ClassKey("flatPrimary")

  object flatAccent                                extends ClassKey("flatAccent")

  object flatContrast                              extends ClassKey("flatContrast")

  object colorInherit                              extends ClassKey("colorInherit")

  object raised                                    extends ClassKey("raised")

  object keyboardFocused                           extends ClassKey("keyboardFocused")

  object raisedPrimary                             extends ClassKey("raisedPrimary")

  object raisedAccent                              extends ClassKey("raisedAccent")

  object raisedContrast                            extends ClassKey("raisedContrast")

  object disabled                                  extends ClassKey("disabled")

  object fab                                       extends ClassKey("fab")

  object mini                                      extends ClassKey("mini")

  @JSImport("@material-ui/core", "Button")
  @js.native
  private object RawComponent extends js.Object
}
