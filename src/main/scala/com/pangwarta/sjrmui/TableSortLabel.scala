package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TableSortLabel {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    direction: js.UndefOr[String] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      active,
      classes,
      className,
      direction,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    active: js.UndefOr[Boolean],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    direction: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    active.foreach(p.updateDynamic("active")(_))
    className.foreach(p.updateDynamic("className")(_))
    direction.foreach(p.updateDynamic("direction")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean]    = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
    var direction: js.UndefOr[String]  = js.native
  }

  sealed abstract case class Direction(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object Direction {
    object asc  extends Direction("asc")
    object desc extends Direction("desc")
  }

  object ClassKey {
    object root   extends ClassKey("root")
    object active extends ClassKey("active")
    object icon   extends ClassKey("icon")
    object desc   extends ClassKey("desc")
    object asc    extends ClassKey("asc")
  }

  @JSImport("@material-ui/core", "TableSortLabel")
  @js.native
  private object RawComponent extends js.Object
}
