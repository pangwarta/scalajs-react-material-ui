package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

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
    var fullScreen: Boolean = js.native
    var ignoreBackdropClick: Boolean = js.native
    var ignoreEscapeKeyUp: Boolean = js.native
    var transitionDuration: Transition.Duration = js.native
    var maxWidth: MaxWidth = js.native
    var fullWidth: Boolean = js.native
    var onBackdropClick: OnJSEv1[ReactEvent] = js.native
    var onEnter: OptJsFun1[html.Element] = js.native
    var onEntering: OptJsFun1[html.Element] = js.native
    var onEntered: OptJsFun1[html.Element] = js.native
    var onEscapeKeyUp: OnJSEv1[ReactKeyboardEvent] = js.native
    var onExit: OptJsFun1[html.Element] = js.native
    var onExiting: OptJsFun1[html.Element] = js.native
    var onExited: OptJsFun1[html.Element] = js.native
    var onRequestClose: OnJSEv1[ReactEvent] = js.native
    var open: Boolean = js.native
    // TODO: var transition: ReactComponent[_, _] = js.native
  }

  private def props(
      classes:             js.Dictionary[String],
      className:           js.UndefOr[String],
      fullScreen:          Boolean,
      ignoreBackdropClick: Boolean,
      ignoreEscapeKeyUp:   Boolean,
      transitionDuration:  Transition.Duration,
      maxWidth:            String,
      fullWidth:           Boolean,
      onBackdropClick:     OnJSEv1[ReactEvent],
      onEnter:             OptJsFun1[html.Element],
      onEntering:          OptJsFun1[html.Element],
      onEntered:           OptJsFun1[html.Element],
      onEscapeKeyUp:       OnJSEv1[ReactKeyboardEvent],
      onExit:              OptJsFun1[html.Element],
      onExiting:           OptJsFun1[html.Element],
      onExited:            OptJsFun1[html.Element],
      onClose:             OnJSEv1[ReactEvent],
      open:                Boolean,
      otherProps:          (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes             = classes,
      className           = className,
      fullScreen          = fullScreen,
      ignoreBackdropClick = ignoreBackdropClick,
      ignoreEscapeKeyUp   = ignoreEscapeKeyUp,
      transitionDuration  = transitionDuration,
      maxWidth            = maxWidth,
      fullWidth           = fullWidth,
      onBackdropClick     = onBackdropClick,
      onEnter             = onEnter,
      onEntering          = onEntering,
      onEntered           = onEntered,
      onEscapeKeyUp       = onEscapeKeyUp,
      onExit              = onExit,
      onExiting           = onExiting,
      onExited            = onExited,
      onClose             = onClose,
      open                = open
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  val defaultTransitionDuration: Transition = {
    val d = (new js.Object).asInstanceOf[Transition]
    d.enter = 0.0
    d.exit = 0.0
    d
  }

  def apply(
      classes:             Map[String, String]               = Map.empty,
      className:           js.UndefOr[String]                = js.undefined,
      fullScreen:          Boolean                           = false,
      ignoreBackdropClick: Boolean                           = false,
      ignoreEscapeKeyUp:   Boolean                           = false,
      transitionDuration:  Transition.Duration               = defaultTransitionDuration,
      maxWidth:            MaxWidth                          = MaxWidth.sm,
      fullWidth:           Boolean                           = false,
      onBackdropClick:     ReactHandler1[ReactEvent]         = js.undefined,
      onEnter:             Handler1[html.Element]            = js.undefined,
      onEntering:          Handler1[html.Element]            = js.undefined,
      onEntered:           Handler1[html.Element]            = js.undefined,
      onEscapeKeyUp:       ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onExit:              Handler1[html.Element]            = js.undefined,
      onExiting:           Handler1[html.Element]            = js.undefined,
      onExited:            Handler1[html.Element]            = js.undefined,
      onClose:             ReactHandler1[ReactEvent]         = js.undefined,
      open:                Boolean                           = false
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      fullScreen,
      ignoreBackdropClick,
      ignoreEscapeKeyUp,
      transitionDuration,
      maxWidth,
      fullWidth,
      onBackdropClick,
      onEnter,
      onEntering,
      onEntered,
      onEscapeKeyUp,
      onExit,
      onExiting,
      onExited,
      onClose,
      open,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
