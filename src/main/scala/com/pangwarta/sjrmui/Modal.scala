package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Modal {

  @JSImport("material-ui", "Modal")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends Portal.Props {
    // TODO: var BackdropComponent: js.UndefOr[???] = js.native
    var BackdropProps: js.UndefOr[Backdrop.Props] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableAutoFocus: js.UndefOr[Boolean] = js.native
    var disableBackdropClick: js.UndefOr[Boolean] = js.native
    var disableEnforceFocus: js.UndefOr[Boolean] = js.native
    var disableEscapeKeyDown: js.UndefOr[Boolean] = js.native
    var disableRestoreFocus: js.UndefOr[Boolean] = js.native
    var hideBackdrop: js.UndefOr[Boolean] = js.native
    var keepMounted: js.UndefOr[Boolean] = js.native
    var manager: js.UndefOr[ModalManager] = js.native
    var onBackdropClick: OnJSEv1[ReactEventFromHtml] = js.native
    var onClose: OnJSEv2[ReactEventFromHtml, String] = js.native
    var onEscapeKeyDown: OnJSEv1[ReactMouseEventFromHtml] = js.native
    var open: Boolean = js.native
  }

  private def props(
      // TODO: BackdropComponent:    js.UndefOr[Backdrop.ComponentType],
      BackdropProps:        js.UndefOr[Backdrop.Props],
      classes:              js.Dictionary[String],
      className:            js.UndefOr[String],
      disableAutoFocus:     js.UndefOr[Boolean],
      disableBackdropClick: js.UndefOr[Boolean],
      disableEnforceFocus:  js.UndefOr[Boolean],
      disableEscapeKeyDown: js.UndefOr[Boolean],
      disableRestoreFocus:  js.UndefOr[Boolean],
      hideBackdrop:         js.UndefOr[Boolean],
      keepMounted:          js.UndefOr[Boolean],
      manager:              js.UndefOr[ModalManager],
      onBackdropClick:      OnJSEv1[ReactEventFromHtml],
      onClose:              OnJSEv2[ReactEventFromHtml, String],
      onEscapeKeyDown:      OnJSEv1[ReactMouseEventFromHtml],
      open:                 Boolean,
      otherProps:           (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      BackdropProps        = BackdropProps,
      classes              = classes,
      className            = className,
      disableAutoFocus     = disableAutoFocus,
      disableBackdropClick = disableBackdropClick,
      disableEnforceFocus  = disableEnforceFocus,
      disableEscapeKeyDown = disableEscapeKeyDown,
      disableRestoreFocus  = disableRestoreFocus,
      hideBackdrop         = hideBackdrop,
      keepMounted          = keepMounted,
      manager              = manager,
      onBackdropClick      = onBackdropClick,
      onClose              = onClose,
      onEscapeKeyDown      = onEscapeKeyDown,
      open                 = open
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object hidden extends ClassKey("hidden")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      // TODO: BackdropComponent:    js.UndefOr[Backdrop.Type] = Backdrop.component,
      BackdropProps:        js.UndefOr[Backdrop.Props]                = js.undefined,
      classes:              Map[String, String]                       = Map.empty,
      className:            js.UndefOr[String]                        = js.undefined,
      disableAutoFocus:     js.UndefOr[Boolean]                       = false,
      disableBackdropClick: js.UndefOr[Boolean]                       = false,
      disableEnforceFocus:  js.UndefOr[Boolean]                       = false,
      disableEscapeKeyDown: js.UndefOr[Boolean]                       = false,
      disableRestoreFocus:  js.UndefOr[Boolean]                       = false,
      hideBackdrop:         js.UndefOr[Boolean]                       = false,
      keepMounted:          js.UndefOr[Boolean]                       = false,
      manager:              js.UndefOr[ModalManager]                  = new ModalManager(),
      onBackdropClick:      ReactHandler1[ReactEventFromHtml]         = js.undefined,
      onClose:              ReactHandler2[ReactEventFromHtml, String] = js.undefined,
      onEscapeKeyDown:      ReactHandler1[ReactMouseEventFromHtml]    = js.undefined,
      open:                 Boolean
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      BackdropProps,
      classes,
      className,
      disableAutoFocus,
      disableBackdropClick,
      disableEnforceFocus,
      disableEscapeKeyDown,
      disableRestoreFocus,
      hideBackdrop,
      keepMounted,
      manager,
      onBackdropClick,
      onClose,
      onEscapeKeyDown,
      open,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
