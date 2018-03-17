package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Typography {

  @JSImport("material-ui", "Typography")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Alignment(get: String) extends StringType
  object Alignment {
    object inherit extends Alignment("inherit")
    object left extends Alignment("left")
    object center extends Alignment("center")
    object right extends Alignment("right")
    object justify extends Alignment("justify")
  }

  sealed abstract case class Color(get: String) extends StringType
  object Color {
    object inherit extends Color("inherit")
    object primary extends Color("primary")
    object secondary extends Color("secondary")
    object accent extends Color("accent")
    object error extends Color("error")
    object default extends Color("default")
  }

  sealed abstract case class Variant(get: String) extends StringType
  object Variant {
    object display4 extends Variant("display4")
    object display3 extends Variant("display3")
    object display2 extends Variant("display2")
    object display1 extends Variant("display1")
    object headline extends Variant("headline")
    object title extends Variant("title")
    object subheading extends Variant("subheading")
    object body2 extends Variant("body2")
    object body1 extends Variant("body1")
    object caption extends Variant("caption")
    object button extends Variant("button")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var align: js.UndefOr[String] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var color: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var gutterBottom: js.UndefOr[Boolean] = js.native
    var noWrap: js.UndefOr[Boolean] = js.native
    var paragraph: js.UndefOr[Boolean] = js.native
    var variant: js.UndefOr[String] = js.native
  }

  private def props(
      align:        js.UndefOr[String],
      classes:      js.Dictionary[String],
      className:    js.UndefOr[String],
      color:        js.UndefOr[String],
      component:    js.UndefOr[String | ReactElement],
      gutterBottom: js.UndefOr[Boolean],
      noWrap:       js.UndefOr[Boolean],
      paragraph:    js.UndefOr[Boolean],
      variant:      js.UndefOr[String],
      otherProps:   (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    align.foreach(p.updateDynamic("align")(_))
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    component.foreach(p.updateDynamic("component")(_))
    gutterBottom.foreach(p.updateDynamic("gutterBottom")(_))
    noWrap.foreach(p.updateDynamic("noWrap")(_))
    paragraph.foreach(p.updateDynamic("paragraph")(_))
    variant.foreach(p.updateDynamic("variant")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object display4 extends ClassKey("display4")
    object display3 extends ClassKey("display3")
    object display2 extends ClassKey("display2")
    object display1 extends ClassKey("display1")
    object headline extends ClassKey("headline")
    object title extends ClassKey("title")
    object subheading extends ClassKey("subheading")
    object body2 extends ClassKey("body2")
    object body1 extends ClassKey("body1")
    object caption extends ClassKey("caption")
    object button extends ClassKey("button")
    object alignLeft extends ClassKey("alignLeft")
    object alignCenter extends ClassKey("alignCenter")
    object alignRight extends ClassKey("alignRight")
    object alignJustify extends ClassKey("alignJustify")
    object noWrap extends ClassKey("noWrap")
    object gutterBottom extends ClassKey("gutterBottom")
    object paragraph extends ClassKey("paragraph")
    object colorInherit extends ClassKey("colorInherit")
    object colorPrimary extends ClassKey("colorPrimary")
    object colorSecondary extends ClassKey("colorSecondary")
    object colorAccent extends ClassKey("colorAccent")
    object colorError extends ClassKey("colorError")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      align:        js.UndefOr[Alignment]             = js.undefined,
      classes:      Map[ClassKey, String]             = Map.empty,
      className:    js.UndefOr[String]                = js.undefined,
      color:        js.UndefOr[Color]                 = js.undefined,
      component:    js.UndefOr[String | ReactElement] = js.undefined,
      gutterBottom: js.UndefOr[Boolean]               = js.undefined,
      noWrap:       js.UndefOr[Boolean]               = js.undefined,
      paragraph:    js.UndefOr[Boolean]               = js.undefined,
      variant:      js.UndefOr[Variant]               = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      align,
      classes,
      className,
      color,
      component,
      gutterBottom,
      noWrap,
      paragraph,
      variant,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
