package com.pangwarta.sjrmui

import internal.Transition
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Menu {

  @JSImport("material-ui", "Menu")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  trait Props extends Transition.HandlerOpts {
    var anchorEl: js.UndefOr[html.Element] = js.native
    var classes: js.Dictionary[String] = js.native
    var MenuListProps: js.UndefOr[MenuList.Props] = js.native
    var onClose: OnJSEv1[ReactEvent] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var PaperProps: js.UndefOr[Paper.Props] = js.native
    var PopoverClasses: js.UndefOr[Popover.Props] = js.native
    var theme: js.UndefOr[js.Object] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
  }

  private def props(
      anchorEl:           js.UndefOr[html.Element],
      classes:            js.Dictionary[String],
      MenuListProps:      js.UndefOr[MenuList.Props],
      onClose:            OnJSEv1[ReactEvent],
      open:               Boolean,
      PaperProps:         js.UndefOr[Paper.Props],
      PopoverClasses:     js.UndefOr[Popover.Props],
      theme:              js.UndefOr[js.Object],
      transitionDuration: js.UndefOr[Transition.Duration],
      otherProps:         (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes = classes,
      open    = open
    )
    anchorEl.foreach(p.updateDynamic("anchorEl")(_))
    MenuListProps.foreach(p.updateDynamic("MenuListProps")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    PaperProps.foreach(p.updateDynamic("PaperProps")(_))
    PopoverClasses.foreach(p.updateDynamic("PopoverClasses")(_))
    theme.foreach(p.updateDynamic("theme")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object hidden extends ClassKey("hidden")
  object paper extends ClassKey("paper")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      anchorEl:           js.UndefOr[html.Element]        = js.undefined,
      classes:            Map[ClassKey, String]           = Map.empty,
      MenuListProps:      js.UndefOr[MenuList.Props]      = js.undefined,
      onClose:            OnJSEv1[ReactEvent]             = js.undefined,
      open:               Boolean,
      PaperProps:         js.UndefOr[Paper.Props]         = js.undefined,
      PopoverClasses:     js.UndefOr[Popover.Props]       = js.undefined,
      theme:              js.UndefOr[js.Object]           = js.undefined,
      transitionDuration: js.UndefOr[Transition.Duration] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      anchorEl,
      classes,
      MenuListProps,
      onClose,
      open,
      PaperProps,
      PopoverClasses,
      theme,
      transitionDuration,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
