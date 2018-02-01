package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import com.pangwarta.sjrmui.transitions.Slide
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactNode
import japgolly.scalajs.react.vdom.VdomElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Drawer {

  @JSImport("material-ui", "Drawer")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends Modal.Props {
    var anchor: js.UndefOr[String] = js.native
    var elevation: js.UndefOr[Int] = js.native
    var ModalProps: js.UndefOr[Modal.Props] = js.native
    var SlideProps: js.UndefOr[Slide.Props] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
    var `type`: js.UndefOr[String] = js.native
  }

  private def props(
      container:            js.UndefOr[js.Any | js.Function],
      onRendered:           js.UndefOr[js.Function0[Unit]],
      BackdropComponent:    js.UndefOr[ReactNode],
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
      open:                 js.UndefOr[Boolean],
      anchor:               js.UndefOr[String],
      elevation:            js.UndefOr[Int],
      ModalProps:           js.UndefOr[Modal.Props],
      SlideProps:           js.UndefOr[Slide.Props],
      transitionDuration:   js.UndefOr[Transition.Duration],
      `type`:               js.UndefOr[String],
      otherProps:           (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    container.foreach(p.updateDynamic("container")(_))
    onRendered.foreach(p.updateDynamic("onRendered")(_))
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
    anchor.foreach(p.updateDynamic("anchor")(_))
    elevation.foreach(p.updateDynamic("elevation")(_))
    ModalProps.foreach(p.updateDynamic("ModalProps")(_))
    SlideProps.foreach(p.updateDynamic("SlideProps")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    `type`.foreach(p.updateDynamic("`type`")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class Anchor(get: String) extends StringType
  object Anchor {
    object left extends Anchor("left")
    object top extends Anchor("top")
    object right extends Anchor("right")
    object bottom extends Anchor("bottom")
  }

  sealed abstract case class Type(get: String) extends StringType
  object Type {
    object permanent extends Type("permanent")
    object persistent extends Type("persistent")
    object temporary extends Type("temporary")
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object docked extends ClassKey("docked")
    object paper extends ClassKey("paper")
    object paperAnchorLeft extends ClassKey("paperAnchorLeft")
    object paperAnchorRight extends ClassKey("paperAnchorRight")
    object paperAnchorTop extends ClassKey("paperAnchorTop")
    object paperAnchorBottom extends ClassKey("paperAnchorBottom")
    object paperAnchorDockedLeft extends ClassKey("paperAnchorDockedLeft")
    object paperAnchorDockedTop extends ClassKey("paperAnchorDockedTop")
    object paperAnchorDockedRight extends ClassKey("paperAnchorDockedRight")
    object paperAnchorDockedBottom extends ClassKey("paperAnchorDockedBottom")
    object modal extends ClassKey("modal")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      container:            js.UndefOr[js.Any | js.Function]          = js.undefined,
      onRendered:           js.UndefOr[js.Function0[Unit]]            = js.undefined,
      BackdropComponent:    js.UndefOr[ReactNode]                     = js.undefined,
      BackdropProps:        js.UndefOr[Backdrop.Props]                = js.undefined,
      classes:              Map[String, String]                       = Map.empty,
      className:            js.UndefOr[String]                        = js.undefined,
      disableAutoFocus:     js.UndefOr[Boolean]                       = js.undefined,
      disableBackdropClick: js.UndefOr[Boolean]                       = js.undefined,
      disableEnforceFocus:  js.UndefOr[Boolean]                       = js.undefined,
      disableEscapeKeyDown: js.UndefOr[Boolean]                       = js.undefined,
      disableRestoreFocus:  js.UndefOr[Boolean]                       = js.undefined,
      hideBackdrop:         js.UndefOr[Boolean]                       = js.undefined,
      keepMounted:          js.UndefOr[Boolean]                       = js.undefined,
      manager:              js.UndefOr[ModalManager]                  = js.undefined,
      onBackdropClick:      ReactHandler1[ReactEventFromHtml]         = js.undefined,
      onClose:              ReactHandler2[ReactEventFromHtml, String] = js.undefined,
      onEscapeKeyDown:      ReactHandler1[ReactMouseEventFromHtml]    = js.undefined,
      open:                 js.UndefOr[Boolean]                       = js.undefined,
      anchor:               js.UndefOr[Anchor]                        = js.undefined,
      elevation:            js.UndefOr[Int]                           = js.undefined,
      ModalProps:           js.UndefOr[Modal.Props]                   = js.undefined,
      SlideProps:           js.UndefOr[Slide.Props]                   = js.undefined,
      transitionDuration:   js.UndefOr[Transition.Duration]           = js.undefined,
      `type`:               js.UndefOr[String]                        = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomElement*) = {
    val p = props(
      container,
      onRendered,
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
      anchor,
      elevation,
      ModalProps,
      SlideProps,
      transitionDuration,
      `type`,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
