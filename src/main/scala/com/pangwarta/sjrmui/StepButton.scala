package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement, Node => ReactNode}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object StepButton {

  type Icon = ReactElement | String | Int
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
    orientation: js.UndefOr[Step.Orientation] = js.undefined
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

  @js.native
  private[sjrmui] trait Props extends ButtonBase.Props {
    var active: js.UndefOr[Boolean]           = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var completed: js.UndefOr[Boolean]        = js.native
    var icon: js.UndefOr[StepButton.Icon]     = js.native
    var last: js.UndefOr[Boolean]             = js.native
    var optional: js.UndefOr[ReactNode]       = js.native
    var orientation: js.UndefOr[String]       = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object ClassKey {
    object root     extends ClassKey("root")
    object disabled extends ClassKey("disabled")
  }

  @JSImport("@material-ui/core", "StepButton")
  @js.native
  private object RawComponent extends js.Object
}
