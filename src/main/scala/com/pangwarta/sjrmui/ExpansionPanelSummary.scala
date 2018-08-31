package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement, Node => ReactNode}
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

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ExpansionPanelSummary {

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
    expanded: js.UndefOr[Boolean] = js.undefined,
    expandIcon: js.UndefOr[ReactElement] = js.undefined,
    onChange: ReactHandler1[ReactEvent] = js.undefined
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
      expanded,
      expandIcon,
      onChange,
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
    expanded: js.UndefOr[Boolean],
    expandIcon: js.UndefOr[ReactElement],
    onChange: OnJSEv1[ReactEvent],
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
    expanded.foreach(p.updateDynamic("expanded")(_))
    expandIcon.foreach(p.updateDynamic("expandIcon")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private def component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var expanded: js.UndefOr[Boolean]     = js.native
    var expandIcon: js.UndefOr[ReactNode] = js.native
    var onChange: OnJSEv1[ReactEvent]     = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root                                      extends ClassKey("root")

  object expanded                                  extends ClassKey("expanded")

  object focused                                   extends ClassKey("focused")

  object disabled                                  extends ClassKey("disabled")

  object content                                   extends ClassKey("content")

  object contentExpanded                           extends ClassKey("contentExpanded")

  object expandIcon                                extends ClassKey("expandIcon")

  object expandIconExpanded                        extends ClassKey("expandIconExpanded")

  @JSImport("@material-ui/core", "ExpansionPanelSummary")
  @js.native
  private object RawComponent extends js.Object
}
