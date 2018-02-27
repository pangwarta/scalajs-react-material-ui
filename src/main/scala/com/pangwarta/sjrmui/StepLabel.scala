package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactNode
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object StepLabel {

  @JSImport("material-ui", "StepLabel")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[StepButton.Icon] = js.native
    var last: js.UndefOr[Boolean] = js.native
    var optional: js.UndefOr[ReactNode] = js.native
    var orientation: js.UndefOr[String] = js.native
  }

  private def props(
                     active: js.UndefOr[Boolean],
                     alternativeLabel: js.UndefOr[Boolean],
                     classes: js.Dictionary[String],
                     className: js.UndefOr[String],
                     completed: js.UndefOr[Boolean],
                     disabled: js.UndefOr[Boolean],
                     icon: js.UndefOr[StepButton.Icon],
                     last: js.UndefOr[Boolean],
                     optional: js.UndefOr[ReactNode],
                     orientation: js.UndefOr[String],
                     otherProps: (String, js.Any)*
                   ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    active.foreach(p.updateDynamic("active")(_))
    alternativeLabel.foreach(p.updateDynamic("alternativeLabel")(_))
    className.foreach(p.updateDynamic("className")(_))
    completed.foreach(p.updateDynamic("completed")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    icon.foreach(p.updateDynamic("icon")(_))
    last.foreach(p.updateDynamic("last")(_))
    optional.foreach(p.updateDynamic("optional")(_))
    orientation.foreach(p.updateDynamic("orientation")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object horizontal extends ClassKey("horizontal")
    object vertical extends ClassKey("vertical")
    object alternativeLabel extends ClassKey("alternativeLabel")
    object disabled extends ClassKey("disabled")
    object label extends ClassKey("label")
    object labelActive extends ClassKey("labelActive")
    object labelCompleted extends ClassKey("labelCompleted")
    object labelAlternativeLabel extends ClassKey("labelAlternativeLabel")
    object iconContainer extends ClassKey("iconContainer")
    object iconContainerNoAlternative extends ClassKey("iconContainerNoAlternative")
    object labelContainer extends ClassKey("labelContainer")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
             active: js.UndefOr[Boolean] = js.undefined,
             alternativeLabel: js.UndefOr[Boolean] = js.undefined,
             classes: Map[ClassKey, String] = Map.empty,
             className: js.UndefOr[String] = js.undefined,
             completed: js.UndefOr[Boolean] = js.undefined,
             disabled: js.UndefOr[Boolean] = js.undefined,
             icon: js.UndefOr[StepButton.Icon] = js.undefined,
             last: js.UndefOr[Boolean] = js.undefined,
             optional: js.UndefOr[ReactNode] = js.undefined,
             orientation: js.UndefOr[Step.Orientation] = js.undefined,
           )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      active,
      alternativeLabel,
      classes,
      className,
      completed,
      disabled,
      icon,
      last,
      optional,
      orientation,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
