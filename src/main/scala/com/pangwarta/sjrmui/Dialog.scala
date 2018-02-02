package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Dialog {

  @JSImport("material-ui", "Dialog")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class MaxWidth(get: String) extends StringType
  object MaxWidth {
    object xs extends MaxWidth("xs")
    object sm extends MaxWidth("sm")
    object md extends MaxWidth("md")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableBackdropClick: js.UndefOr[Boolean] = js.native
    var disableEscapeKeyUp: js.UndefOr[Boolean] = js.native
    var fullScreen: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var maxWidth: js.UndefOr[String] = js.native
    var onBackdropClick: OnJSEv1[ReactEvent] = js.native
    var onClose: OnJSEv1[ReactEvent] = js.native
    var onEnter: OptJsFun1[html.Element] = js.native
    var onEntering: OptJsFun1[html.Element] = js.native
    var onEntered: OptJsFun1[html.Element] = js.native
    var onEscapeKeyDown: OnJSEv1[ReactKeyboardEvent] = js.native
    var onExit: OptJsFun1[html.Element] = js.native
    var onExiting: OptJsFun1[html.Element] = js.native
    var onExited: OptJsFun1[html.Element] = js.native
    var open: Boolean = js.native
    var paperProps: js.UndefOr[Paper.Props] = js.native
    var transition: js.UndefOr[String | js.Function] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
  }

  private def props(
      classes:              js.Dictionary[String],
      className:            js.UndefOr[String],
      disableBackdropClick: js.UndefOr[Boolean],
      disableEscapeKeyUp:   js.UndefOr[Boolean],
      fullScreen:           js.UndefOr[Boolean],
      fullWidth:            js.UndefOr[Boolean],
      maxWidth:             js.UndefOr[String],
      onBackdropClick:      OnJSEv1[ReactEvent],
      onClose:              OnJSEv1[ReactEvent],
      onEnter:              OptJsFun1[html.Element],
      onEntering:           OptJsFun1[html.Element],
      onEntered:            OptJsFun1[html.Element],
      onEscapeKeyDown:      OnJSEv1[ReactKeyboardEvent],
      onExit:               OptJsFun1[html.Element],
      onExiting:            OptJsFun1[html.Element],
      onExited:             OptJsFun1[html.Element],
      open:                 Boolean,
      otherProps:           (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes = classes,
      open    = open
    )
    className.foreach(p.updateDynamic("className")(_))
    disableBackdropClick.foreach(p.updateDynamic("disableBackdropClick")(_))
    disableEscapeKeyUp.foreach(p.updateDynamic("disableEscapeKeyUp")(_))
    fullScreen.foreach(p.updateDynamic("fullScreen")(_))
    fullWidth.foreach(p.updateDynamic("fullWidth")(_))
    maxWidth.foreach(p.updateDynamic("maxWidth")(_))
    onBackdropClick.foreach(p.updateDynamic("onBackdropClick")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onEscapeKeyDown.foreach(p.updateDynamic("onEscapeKeyDown")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    onExited.foreach(p.updateDynamic("onExited")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object hidden extends ClassKey("hidden")
  object paper extends ClassKey("paper")
  object paperWidthXs extends ClassKey("paperWidthXs")
  object paperWidthSm extends ClassKey("paperWidthSm")
  object paperWidthMd extends ClassKey("paperWidthMd")
  object fullWidth extends ClassKey("fullWidth")
  object fullScreen extends ClassKey("fullScreen")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:              Map[ClassKey, String]             = Map.empty,
      className:            js.UndefOr[String]                = js.undefined,
      disableBackdropClick: js.UndefOr[Boolean]               = js.undefined,
      disableEscapeKeyUp:   js.UndefOr[Boolean]               = js.undefined,
      fullScreen:           js.UndefOr[Boolean]               = js.undefined,
      fullWidth:            js.UndefOr[Boolean]               = js.undefined,
      maxWidth:             js.UndefOr[String]                = js.undefined,
      onBackdropClick:      ReactHandler1[ReactEvent]         = js.undefined,
      onClose:              ReactHandler1[ReactEvent]         = js.undefined,
      onEnter:              Handler1[html.Element]            = js.undefined,
      onEntering:           Handler1[html.Element]            = js.undefined,
      onEntered:            Handler1[html.Element]            = js.undefined,
      onEscapeKeyDown:      ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onExit:               Handler1[html.Element]            = js.undefined,
      onExiting:            Handler1[html.Element]            = js.undefined,
      onExited:             Handler1[html.Element]            = js.undefined,
      open:                 Boolean
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableBackdropClick,
      disableEscapeKeyUp,
      fullScreen,
      fullWidth,
      maxWidth,
      onBackdropClick,
      onClose,
      onEnter,
      onEntering,
      onEntered,
      onEscapeKeyDown,
      onExit,
      onExiting,
      onExited,
      open,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
