package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Step {

  @JSImport("material-ui", "Step")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean] = js.native
    var alternativeLabel: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var connector: js.UndefOr[ReactElement] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var index: js.UndefOr[Int] = js.native
    var last: js.UndefOr[Boolean] = js.native
    var orientation: js.UndefOr[String] = js.native
  }

  abstract sealed case class Orientation(get: String) extends StringType
  object Orientation {
    object horizontal extends Orientation("horizontal")
    object vertical extends Orientation("vertical")
  }

  private def props(
      active:           js.UndefOr[Boolean],
      alternativeLabel: js.UndefOr[Boolean],
      classes:          js.Dictionary[String],
      className:        js.UndefOr[String],
      completed:        js.UndefOr[Boolean],
      connector:        js.UndefOr[ReactElement],
      disabled:         js.UndefOr[Boolean],
      index:            js.UndefOr[Int],
      last:             js.UndefOr[Boolean],
      orientation:      js.UndefOr[String],
      otherProps:       (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    active.foreach(p.updateDynamic("active")(_))
    alternativeLabel.foreach(p.updateDynamic("alternativeLabel")(_))
    className.foreach(p.updateDynamic("className")(_))
    completed.foreach(p.updateDynamic("completed")(_))
    connector.foreach(p.updateDynamic("connector")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    index.foreach(p.updateDynamic("index")(_))
    last.foreach(p.updateDynamic("last")(_))
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
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      active:           js.UndefOr[Boolean]      = js.undefined,
      alternativeLabel: js.UndefOr[Boolean]      = js.undefined,
      classes:          Map[ClassKey, String]    = Map.empty,
      className:        js.UndefOr[String]       = js.undefined,
      completed:        js.UndefOr[Boolean]      = js.undefined,
      connector:        js.UndefOr[ReactElement] = js.undefined,
      disabled:         js.UndefOr[Boolean]      = js.undefined,
      index:            js.UndefOr[Int]          = js.undefined,
      last:             js.UndefOr[Boolean]      = js.undefined,
      orientation:      js.UndefOr[Orientation]  = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      active,
      alternativeLabel,
      classes,
      className,
      completed,
      connector,
      disabled,
      index,
      last,
      orientation,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
