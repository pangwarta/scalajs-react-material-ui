package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TableCell {

  @JSImport("material-ui", "TableCell")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Padding(get: String) extends StringType
  object default extends Padding("default")
  object checkbox extends Padding("checkbox")
  object dense extends Padding("dense")
  object none extends Padding("none")

  sealed abstract case class SortDirection(get: String) extends StringType
  object asc extends SortDirection("asc")
  object desc extends SortDirection("desc")
  //object false extends SortDirection("false")

  sealed abstract case class Variant(get: String) extends StringType
  object head extends Variant("head")
  object body extends Variant("body")
  object footer extends Variant("footer")

  @js.native
  private[sjrmui] trait Props extends js.Object {

    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var numeric: js.UndefOr[Boolean] = js.native
    var scope: js.UndefOr[String] = js.native
  }

  private def props(
      classes:       js.Dictionary[String],
      className:     js.UndefOr[String],
      component:     js.UndefOr[String | ReactElement],
      numeric:       js.UndefOr[Boolean],
      scope:         js.UndefOr[String],
      padding:       js.UndefOr[String],
      sortDirection: js.UndefOr[String],
      variant:       js.UndefOr[String],
      otherProps:    (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(v => p.updateDynamic("className")(v))
    component.foreach(v => p.updateDynamic("component")(v))
    numeric.foreach(v => p.updateDynamic("numeric")(v))
    scope.foreach(v => p.updateDynamic("scope")(v))
    padding.foreach(v => p.updateDynamic("padding")(v))
    sortDirection.foreach(v => p.updateDynamic("sortDirection")(v))
    variant.foreach(v => p.updateDynamic("variant")(v))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object numeric extends ClassKey("numeric")
  object typeHead extends ClassKey("typeHead")
  object typeBody extends ClassKey("typeBody")
  object typeFooter extends ClassKey("typeFooter")
  object paddingDefault extends ClassKey("paddingDefault")
  object paddingDense extends ClassKey("paddingDense")
  object paddingCheckbox extends ClassKey("paddingCheckbox")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:       Map[ClassKey, String]             = Map.empty,
      className:     js.UndefOr[String]                = js.undefined,
      component:     js.UndefOr[String | ReactElement] = js.undefined,
      numeric:       js.UndefOr[Boolean]               = js.undefined,
      scope:         js.UndefOr[String]                = js.undefined,
      padding:       js.UndefOr[String]                = js.undefined,
      sortDirection: js.UndefOr[String]                = js.undefined,
      variant:       js.UndefOr[String]                = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      numeric,
      scope,
      padding,
      sortDirection,
      variant,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
