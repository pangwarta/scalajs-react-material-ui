package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Node => ReactNode}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEventFromHtml, ReactMouseEventFromHtml}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Modal {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    BackdropComponent: js.UndefOr[ReactNode] = js.undefined,
    BackdropProps: js.UndefOr[Backdrop.Props] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    disableAutoFocus: js.UndefOr[Boolean] = js.undefined,
    disableBackdropClick: js.UndefOr[Boolean] = js.undefined,
    disableEnforceFocus: js.UndefOr[Boolean] = js.undefined,
    disableEscapeKeyDown: js.UndefOr[Boolean] = js.undefined,
    disableRestoreFocus: js.UndefOr[Boolean] = js.undefined,
    hideBackdrop: js.UndefOr[Boolean] = js.undefined,
    keepMounted: js.UndefOr[Boolean] = js.undefined,
    manager: js.UndefOr[ModalManager] = js.undefined,
    onBackdropClick: ReactHandler1[ReactEventFromHtml] = js.undefined,
    onClose: ReactHandler2[ReactEventFromHtml, String] = js.undefined,
    onEscapeKeyDown: ReactHandler1[ReactMouseEventFromHtml] = js.undefined,
    open: Boolean
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      BackdropComponent,
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

  private def props(
    BackdropComponent: js.UndefOr[ReactNode],
    BackdropProps: js.UndefOr[Backdrop.Props],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    disableAutoFocus: js.UndefOr[Boolean],
    disableBackdropClick: js.UndefOr[Boolean],
    disableEnforceFocus: js.UndefOr[Boolean],
    disableEscapeKeyDown: js.UndefOr[Boolean],
    disableRestoreFocus: js.UndefOr[Boolean],
    hideBackdrop: js.UndefOr[Boolean],
    keepMounted: js.UndefOr[Boolean],
    manager: js.UndefOr[ModalManager],
    onBackdropClick: OnJSEv1[ReactEventFromHtml],
    onClose: OnJSEv2[ReactEventFromHtml, String],
    onEscapeKeyDown: OnJSEv1[ReactMouseEventFromHtml],
    open: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    BackdropComponent.foreach(p.updateDynamic("BackdropComponent")(_))
    BackdropProps.foreach(p.updateDynamic("BackdropProps")(_))
    className.foreach(p.updateDynamic("className")(_))
    disableAutoFocus.foreach(p.updateDynamic("disableAutoFocus")(_))
    disableBackdropClick.foreach(p.updateDynamic("disableBackdropClick")(_))
    disableEnforceFocus.foreach(p.updateDynamic("disableEnforceFocus")(_))
    disableEscapeKeyDown.foreach(p.updateDynamic("disableEscapeKeyDown")(_))
    disableRestoreFocus.foreach(p.updateDynamic("disableRestoreFocus")(_))
    hideBackdrop.foreach(p.updateDynamic("hideBackdrop")(_))
    keepMounted.foreach(p.updateDynamic("keepMounted")(_))
    manager.foreach(p.updateDynamic("manager")(_))
    onBackdropClick.foreach(p.updateDynamic("onBackdropClick")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onEscapeKeyDown.foreach(p.updateDynamic("onEscapeKeyDown")(_))
    open.foreach(p.updateDynamic("open")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends Portal.Props {
    var BackdropComponent: js.UndefOr[ReactNode]          = js.native
    var BackdropProps: js.UndefOr[Backdrop.Props]         = js.native
    var classes: js.Dictionary[String]                    = js.native
    var className: js.UndefOr[String]                     = js.native
    var disableAutoFocus: js.UndefOr[Boolean]             = js.native
    var disableBackdropClick: js.UndefOr[Boolean]         = js.native
    var disableEnforceFocus: js.UndefOr[Boolean]          = js.native
    var disableEscapeKeyDown: js.UndefOr[Boolean]         = js.native
    var disableRestoreFocus: js.UndefOr[Boolean]          = js.native
    var hideBackdrop: js.UndefOr[Boolean]                 = js.native
    var keepMounted: js.UndefOr[Boolean]                  = js.native
    var manager: js.UndefOr[ModalManager]                 = js.native
    var onBackdropClick: OnJSEv1[ReactEventFromHtml]      = js.native
    var onClose: OnJSEv2[ReactEventFromHtml, String]      = js.native
    var onEscapeKeyDown: OnJSEv1[ReactMouseEventFromHtml] = js.native
    var open: js.UndefOr[Boolean]                         = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root extends ClassKey("root")

  object hidden extends ClassKey("hidden")

  @JSImport("@material-ui/core", "Modal")
  @js.native
  private object RawComponent extends js.Object
}
