package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object GridListTile {

  @JSImport("material-ui", "GridListTile")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var cols: js.UndefOr[Int] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var rows: js.UndefOr[Int] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      cols:       js.UndefOr[Int],
      component:  js.UndefOr[String | ReactElement],
      rows:       js.UndefOr[Int],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    cols.foreach(p.updateDynamic("cols")(_))
    component.foreach(p.updateDynamic("component")(_))
    rows.foreach(p.updateDynamic("rows")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object tile extends ClassKey("tile")
  object imgFullHeight extends ClassKey("imgFullHeight")
  object imgFullWidth extends ClassKey("imgFullWidth")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String]             = Map.empty,
      className: js.UndefOr[String],
      cols:      js.UndefOr[Int],
      component: js.UndefOr[String | ReactElement],
      rows:      js.UndefOr[Int]
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      cols,
      component,
      rows,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
