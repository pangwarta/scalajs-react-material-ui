package com.github.zachalbia.sjrmui

import com.github.zachalbia.sjrmui.internal.Transition
import japgolly.scalajs.react._

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
    var onEnter: js.UndefOr[Transition.Callback] = js.native
    var onEntering: js.UndefOr[Transition.Callback] = js.native
    var onEntered: js.UndefOr[Transition.Callback] = js.native
    var onEscapeKeyUp: OnJSEv1[ReactKeyboardEvent] = js.native
    var onExit: js.UndefOr[Transition.Callback] = js.native
    var onExiting: js.UndefOr[Transition.Callback] = js.native
    var onExited: js.UndefOr[Transition.Callback] = js.native
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
      onEnter:             js.UndefOr[Transition.Callback],
      onEntering:          js.UndefOr[Transition.Callback],
      onEntered:           js.UndefOr[Transition.Callback],
      onEscapeKeyUp:       OnJSEv1[ReactKeyboardEvent],
      onExit:              js.UndefOr[Transition.Callback],
      onExiting:           js.UndefOr[Transition.Callback],
      onExited:            js.UndefOr[Transition.Callback],
      onRequestClose:      OnJSEv1[ReactEvent],
      open:                Boolean,
      otherProps:          (String, js.Any)*): Props = {
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
      onRequestClose      = onRequestClose,
      open                = open)
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
      classes:             Map[String, String]    = Map.empty,
      className:           js.UndefOr[String]     = js.undefined,
      fullScreen:          Boolean                = false,
      ignoreBackdropClick: Boolean                = false,
      ignoreEscapeKeyUp:   Boolean                = false,
      transitionDuration:  Transition.Duration    = defaultTransitionDuration,
      maxWidth:            MaxWidth               = MaxWidth.sm,
      fullWidth:           Boolean                = false,
      onBackdropClick:     EvHandler1[ReactEvent] = js.undefined) = {

  }
}
