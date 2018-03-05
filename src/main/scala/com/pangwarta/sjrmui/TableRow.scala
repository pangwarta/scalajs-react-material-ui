package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TableRow {

  @JSImport("material-ui", "TableRow")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var hover: js.UndefOr[Boolean] = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      component:  js.UndefOr[String | ReactElement],
      hover:      js.UndefOr[Boolean],
      selected:   js.UndefOr[Boolean],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    hover.foreach(p.updateDynamic("hover")(_))
    selected.foreach(p.updateDynamic("selected")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object typeHead extends ClassKey("typeHead")
    object typeFooter extends ClassKey("typeFooter")
    object selected extends ClassKey("selected")
    object hover extends ClassKey("hover")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String]             = Map.empty,
      className: js.UndefOr[String]                = js.undefined,
      component: js.UndefOr[String | ReactElement] = js.undefined,
      hover:     js.UndefOr[Boolean]               = js.undefined,
      selected:  js.UndefOr[Boolean]               = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      hover,
      selected,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
