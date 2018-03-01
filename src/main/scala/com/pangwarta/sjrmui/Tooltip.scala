package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactNode
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Tooltip {

  @JSImport("material-ui", "Tooltip")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableTriggerFocus: js.UndefOr[Boolean] = js.native
    var disableTriggerHover: js.UndefOr[Boolean] = js.native
    var disableTriggerTouch: js.UndefOr[Boolean] = js.native
    var enterDelay: js.UndefOr[Int] = js.native
    var id: js.UndefOr[String] = js.native
    var leaveDelay: js.UndefOr[Int] = js.native
    var onClose: OnJSEv1[ReactEventFromHtml] = js.native
    var onOpen: OnJSEv1[ReactEventFromHtml] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var placement: js.UndefOr[String] = js.native
    var PopperProps: js.UndefOr[js.Object] = js.native
    var theme: js.UndefOr[js.Object] = js.native
    var title: ReactNode = js.native
  }

  sealed abstract case class Placement(get: String) extends StringType
  object Placement {
    object bottomEnd extends Placement("bottom-end")
    object bottomStart extends Placement("bottom-start")
    object bottom extends Placement("bottom")
    object leftEnd extends Placement("left-end")
    object leftStart extends Placement("left-start")
    object left extends Placement("left")
    object rightEnd extends Placement("right-end")
    object rightStart extends Placement("right-start")
    object right extends Placement("right")
    object topEnd extends Placement("top-end")
    object topStart extends Placement("top-start")
    object top extends Placement("top")
  }

  private def props(
      classes:             js.Dictionary[String],
      className:           js.UndefOr[String],
      disableTriggerFocus: js.UndefOr[Boolean],
      disableTriggerHover: js.UndefOr[Boolean],
      disableTriggerTouch: js.UndefOr[Boolean],
      enterDelay:          js.UndefOr[Int],
      id:                  js.UndefOr[String],
      leaveDelay:          js.UndefOr[Int],
      onClose:             OnJSEv1[ReactEventFromHtml],
      onOpen:              OnJSEv1[ReactEventFromHtml],
      open:                js.UndefOr[Boolean],
      placement:           js.UndefOr[String],
      PopperProps:         js.UndefOr[js.Object],
      theme:               js.UndefOr[js.Object],
      title:               ReactNode,
      otherProps:          (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes, title = title)
    className.foreach(p.updateDynamic("className")(_))
    disableTriggerFocus.foreach(p.updateDynamic("disableTriggerFocus")(_))
    disableTriggerHover.foreach(p.updateDynamic("disableTriggerHover")(_))
    disableTriggerTouch.foreach(p.updateDynamic("disableTriggerTouch")(_))
    enterDelay.foreach(p.updateDynamic("enterDelay")(_))
    id.foreach(p.updateDynamic("id")(_))
    leaveDelay.foreach(p.updateDynamic("leaveDelay")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onOpen.foreach(p.updateDynamic("onOpen")(_))
    open.foreach(p.updateDynamic("open")(_))
    placement.foreach(p.updateDynamic("placement")(_))
    PopperProps.foreach(p.updateDynamic("PopperProps")(_))
    theme.foreach(p.updateDynamic("theme")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object popper extends ClassKey("popper")
    object popperClose extends ClassKey("popperClose")
    object tooltip extends ClassKey("tooltip")
    object tooltipLeft extends ClassKey("tooltipLeft")
    object tooltipRight extends ClassKey("tooltipRight")
    object tooltipTop extends ClassKey("tooltipTop")
    object tooltipBottom extends ClassKey("tooltipBottom")
    object tooltipOpen extends ClassKey("tooltipOpen")
  }

  val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:             Map[ClassKey, String]       = Map.empty,
      className:           js.UndefOr[String]          = js.undefined,
      disableTriggerFocus: js.UndefOr[Boolean]         = js.undefined,
      disableTriggerHover: js.UndefOr[Boolean]         = js.undefined,
      disableTriggerTouch: js.UndefOr[Boolean]         = js.undefined,
      enterDelay:          js.UndefOr[Int]             = js.undefined,
      id:                  js.UndefOr[String]          = js.undefined,
      leaveDelay:          js.UndefOr[Int]             = js.undefined,
      onClose:             OnJSEv1[ReactEventFromHtml] = js.undefined,
      onOpen:              OnJSEv1[ReactEventFromHtml] = js.undefined,
      open:                js.UndefOr[Boolean]         = js.undefined,
      placement:           js.UndefOr[Placement]       = js.undefined,
      PopperProps:         js.UndefOr[js.Object]       = js.undefined,
      theme:               js.UndefOr[js.Object]       = js.undefined,
      title:               ReactNode
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableTriggerFocus,
      disableTriggerHover,
      disableTriggerTouch,
      enterDelay,
      id,
      leaveDelay,
      onClose,
      onOpen,
      open,
      placement,
      PopperProps,
      theme,
      title,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
