package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import com.pangwarta.sjrmui.styles.Theme
import com.pangwarta.sjrmui.transitions.Slide
import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

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
    var theme: js.UndefOr[Theme] = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
    var `type`: js.UndefOr[String] = js.native
  }

  // TODO add more props when Modal is done
  private def props(
      anchor:             js.UndefOr[String],
      classes:            js.Dictionary[String],
      className:          js.UndefOr[String],
      elevation:          js.UndefOr[Int],
      ModalProps:         js.UndefOr[Modal.Props],
      onClose:            OnJSEv1[ReactEvent],
      open:               js.UndefOr[Boolean],
      SlideProps:         js.UndefOr[Slide.Props],
      theme:              js.UndefOr[Theme],
      transitionDuration: js.UndefOr[Transition.Duration],
      `type`:             js.UndefOr[String],
      otherProps:         (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      anchor             = anchor,
      classes            = classes,
      className          = className,
      elevation          = elevation,
      ModalProps         = ModalProps,
      onClose            = onClose,
      open               = open,
      SlideProps         = SlideProps,
      theme              = theme,
      transitionDuration = transitionDuration,
      `type`             = `type`
    )
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

  // TODO: def apply when done with Modal
}
