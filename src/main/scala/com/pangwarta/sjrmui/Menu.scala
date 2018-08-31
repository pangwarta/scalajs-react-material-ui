package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.Popover.{Actions, Origin, Position}
import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react.raw.React.{Element => ReactElement, Node => ReactNode}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent}
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Menu {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    action: js.UndefOr[js.Function1[Actions, Unit]] = js.undefined,
    anchorEl: js.UndefOr[html.Element] = js.undefined,
    anchorOrigin: js.UndefOr[Origin] = js.undefined,
    anchorPosition: js.UndefOr[Position] = js.undefined,
    anchorReference: js.UndefOr[String] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    container: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    getContentAnchorEl: js.UndefOr[js.Function1[html.Element, html.Element]] = js.undefined,
    marginThreshold: js.UndefOr[Double] = js.undefined,
    MenuListProps: js.UndefOr[MenuList.Props] = js.undefined,
    onClose: ReactHandler1[ReactEvent] = js.undefined,
    onEnter: Handler1[html.Element] = js.undefined,
    onEntered: Handler1[html.Element] = js.undefined,
    onEntering: Handler1[html.Element] = js.undefined,
    onExit: Handler1[html.Element] = js.undefined,
    onExited: Handler1[html.Element] = js.undefined,
    onExiting: Handler1[html.Element] = js.undefined,
    open: Boolean,
    PaperProps: js.UndefOr[Paper.Props] = js.undefined,
    PopoverClasses: js.UndefOr[Popover.Props] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    transformOrigin: js.UndefOr[Origin] = js.undefined,
    theme: js.UndefOr[js.Object] = js.undefined,
    transition: js.UndefOr[String | ReactElement] = js.undefined,
    transitionDuration: js.UndefOr[Transition.Duration] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      action,
      anchorEl,
      anchorOrigin,
      anchorPosition,
      anchorReference,
      classes,
      className,
      container,
      elevation,
      getContentAnchorEl,
      marginThreshold,
      MenuListProps,
      onClose,
      onEnter,
      onEntered,
      onEntering,
      onExit,
      onExited,
      onExiting,
      open,
      PaperProps,
      PopoverClasses,
      role,
      transformOrigin,
      theme,
      transition,
      transitionDuration,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    action: js.UndefOr[js.Function1[Actions, Unit]],
    anchorEl: js.UndefOr[html.Element],
    anchorOrigin: js.UndefOr[Origin],
    anchorPosition: js.UndefOr[Position],
    anchorReference: js.UndefOr[String],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    container: js.UndefOr[ReactNode | js.Function0[ReactNode]],
    elevation: js.UndefOr[Int],
    getContentAnchorEl: js.UndefOr[js.Function1[html.Element, html.Element]],
    marginThreshold: js.UndefOr[Double],
    MenuListProps: js.UndefOr[MenuList.Props],
    onClose: OnJSEv1[ReactEvent],
    onEnter: Handler1[html.Element],
    onEntered: Handler1[html.Element],
    onEntering: Handler1[html.Element],
    onExit: Handler1[html.Element],
    onExited: Handler1[html.Element],
    onExiting: Handler1[html.Element],
    open: Boolean,
    PaperProps: js.UndefOr[Paper.Props],
    PopoverClasses: js.UndefOr[Popover.Props],
    role: js.UndefOr[String],
    transformOrigin: js.UndefOr[Origin],
    theme: js.UndefOr[js.Object],
    transition: js.UndefOr[String | ReactElement],
    transitionDuration: js.UndefOr[Transition.Duration],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes = classes,
      open = open
    )
    action.foreach(p.updateDynamic("action")(_))
    anchorEl.foreach(p.updateDynamic("anchorEl")(_))
    anchorOrigin.foreach(p.updateDynamic("anchorOrigin")(_))
    anchorPosition.foreach(p.updateDynamic("anchorPosition")(_))
    anchorReference.foreach(p.updateDynamic("anchorReference")(_))
    className.foreach(p.updateDynamic("className")(_))
    container.foreach(p.updateDynamic("container")(_))
    elevation.foreach(p.updateDynamic("elevation")(_))
    getContentAnchorEl.foreach(p.updateDynamic("getContentAnchorEl")(_))
    marginThreshold.foreach(p.updateDynamic("marginThreshold")(_))
    MenuListProps.foreach(p.updateDynamic("MenuListProps")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExited.foreach(p.updateDynamic("onExited")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    PaperProps.foreach(p.updateDynamic("PaperProps")(_))
    PopoverClasses.foreach(p.updateDynamic("PopoverClasses")(_))
    role.foreach(p.updateDynamic("role")(_))
    transformOrigin.foreach(p.updateDynamic("transformOrigin")(_))
    theme.foreach(p.updateDynamic("theme")(_))
    transition.foreach(p.updateDynamic("transition")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  trait Props extends Popover.Props {
    var MenuListProps: js.UndefOr[MenuList.Props] = js.native
    var PopoverClasses: js.UndefOr[Popover.Props] = js.native
    var theme: js.UndefOr[js.Object]              = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root extends ClassKey("root")

  object hidden extends ClassKey("hidden")

  object paper extends ClassKey("paper")

  @JSImport("@material-ui/core", "Menu")
  @js.native
  private object RawComponent extends js.Object
}
