package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object GridList {

  val auto = "auto"
  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    cellHeight: js.UndefOr[Double | auto.type] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    cols: js.UndefOr[Int] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    spacing: js.UndefOr[Int] = js.undefined,
    style: js.UndefOr[js.Object] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      cellHeight,
      classes,
      className,
      cols,
      component,
      spacing,
      style,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    cellHeight: js.UndefOr[Double | auto.type],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    cols: js.UndefOr[Int],
    component: js.UndefOr[String | ReactElement],
    spacing: js.UndefOr[Int],
    style: js.UndefOr[js.Object],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    cellHeight.foreach(p.updateDynamic("cellHeight")(_))
    className.foreach(p.updateDynamic("className")(_))
    cols.foreach(p.updateDynamic("cols")(_))
    component.foreach(p.updateDynamic("component")(_))
    spacing.foreach(p.updateDynamic("spacing")(_))
    style.foreach(p.updateDynamic("style")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var cellHeight: js.UndefOr[Double | auto.type]   = js.native
    var classes: js.Dictionary[String]               = js.native
    var className: js.UndefOr[String]                = js.native
    var cols: js.UndefOr[Int]                        = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var spacing: js.UndefOr[Int]                     = js.native
    var style: js.Object                             = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root                                      extends ClassKey("root")

  @JSImport("@material-ui/core", "GridList")
  @js.native
  private object RawComponent extends js.Object
}
