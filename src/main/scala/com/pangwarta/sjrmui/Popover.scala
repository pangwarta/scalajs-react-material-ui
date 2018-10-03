package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react.raw.React.{Element => ReactElement, Node => ReactNode}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent}
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Popover {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    action: js.UndefOr[js.Function1[Actions, Unit]] = js.undefined,
    anchorEl: js.UndefOr[html.Element] = js.undefined,
    anchorOrigin: js.UndefOr[Origin] = js.undefined,
    anchorPosition: js.UndefOr[Position] = js.undefined,
    anchorReference: js.UndefOr[Reference] = js.undefined,
    classes: Map[List.ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    container: js.UndefOr[ReactNode | js.Function0[ReactNode]] = js.undefined,
    elevation: js.UndefOr[Int] = js.undefined,
    getContentAnchorEl: js.UndefOr[js.Function1[html.Element, html.Element]] = js.undefined,
    marginThreshold: js.UndefOr[Double] = js.undefined,
    onClose: OptJsFun1[ReactEvent] = js.undefined,
    onEnter: OptJsFun1[html.Element] = js.undefined,
    onEntered: OptJsFun1[html.Element] = js.undefined,
    onEntering: OptJsFun1[html.Element] = js.undefined,
    onExit: OptJsFun1[html.Element] = js.undefined,
    onExited: OptJsFun1[html.Element] = js.undefined,
    onExiting: OptJsFun1[html.Element] = js.undefined,
    open: Boolean,
    PaperProps: js.UndefOr[Paper.Props] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    transformOrigin: js.UndefOr[Origin] = js.undefined,
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
      onClose,
      onEnter,
      onEntered,
      onEntering,
      onExit,
      onExited,
      onExiting,
      open,
      PaperProps,
      role,
      transformOrigin,
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
    onClose: OptJsFun1[ReactEvent],
    onEnter: OptJsFun1[html.Element],
    onEntered: OptJsFun1[html.Element],
    onEntering: OptJsFun1[html.Element],
    onExit: OptJsFun1[html.Element],
    onExited: OptJsFun1[html.Element],
    onExiting: OptJsFun1[html.Element],
    open: Boolean,
    PaperProps: js.UndefOr[Paper.Props],
    role: js.UndefOr[String],
    transformOrigin: js.UndefOr[Origin],
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
    onClose.foreach(p.updateDynamic("onClose")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExited.foreach(p.updateDynamic("onExited")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    PaperProps.foreach(p.updateDynamic("PaperProps")(_))
    role.foreach(p.updateDynamic("role")(_))
    transformOrigin.foreach(p.updateDynamic("transformOrigin")(_))
    transition.foreach(p.updateDynamic("transition")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    p.asInstanceOf[Props]
  }

  @js.native
  trait Actions extends js.Object {
    def updatePosition(): Unit = js.native
  }

  @js.native
  trait Origin extends js.Object {
    var horizontal: String | Double = js.native
    var vertical: String | Double   = js.native
  }

  @js.native
  trait Position extends js.Object {
    var top: Double  = js.native
    var left: Double = js.native
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var action: js.UndefOr[js.Function1[Actions, Unit]]                          = js.native
    var anchorEl: js.UndefOr[html.Element]                                       = js.native
    var anchorOrigin: js.UndefOr[Origin]                                         = js.native
    var anchorPosition: js.UndefOr[Position]                                     = js.native
    var anchorReference: js.UndefOr[String]                                      = js.native
    var classes: js.Dictionary[String]                                           = js.native
    var className: js.UndefOr[String]                                            = js.native
    var container: js.UndefOr[ReactNode | js.Function0[ReactNode]]               = js.native
    var elevation: js.UndefOr[Int]                                               = js.native
    var getContentAnchorEl: js.UndefOr[js.Function1[html.Element, html.Element]] = js.native
    var marginThreshold: js.UndefOr[Double]                                      = js.native
    var onClose: OptJsFun1[ReactEvent]                                           = js.native
    var onEnter: OptJsFun1[html.Element]                                         = js.native
    var onEntered: OptJsFun1[html.Element]                                       = js.native
    var onEntering: OptJsFun1[html.Element]                                      = js.native
    var onExit: OptJsFun1[html.Element]                                          = js.native
    var onExited: OptJsFun1[html.Element]                                        = js.native
    var onExiting: OptJsFun1[html.Element]                                       = js.native
    var open: Boolean                                                            = js.native
    var PaperProps: js.UndefOr[Paper.Props]                                      = js.native
    var role: js.UndefOr[String]                                                 = js.native
    var transformOrigin: js.UndefOr[Origin]                                      = js.native
    var transition: js.UndefOr[String | ReactElement]                            = js.native
    var transitionDuration: js.UndefOr[Transition.Duration]                      = js.native
  }

  sealed abstract case class Horizontal(get: String) extends StringType

  sealed abstract case class Vertical(get: String) extends StringType

  sealed abstract case class Reference(get: String) extends StringType

  object Horizontal {
    object left   extends Horizontal("left")
    object center extends Horizontal("center")
    object right  extends Horizontal("right")
  }

  object Vertical {
    object top    extends Vertical("top")
    object center extends Vertical("center")
    object bottom extends Vertical("bottom")
  }

  object Reference {
    object anchorEl       extends Horizontal("anchorEl")
    object anchorPosition extends Horizontal("anchorPosition")
  }

  @JSImport("@material-ui/core", "Popover")
  @js.native
  private object RawComponent extends js.Object
}
