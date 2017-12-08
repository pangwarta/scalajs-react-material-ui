package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

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

  sealed abstract case class Type(get: String) extends StringType
  object Type {
    object display4 extends Type("display4")
    object display3 extends Type("display3")
    object display2 extends Type("display2")
    object display1 extends Type("display1")
    object headline extends Type("headline")
    object title extends Type("title")
    object subheading extends Type("subheading")
    object body2 extends Type("body2")
    object body1 extends Type("body1")
    object caption extends Type("caption")
    object button extends Type("button")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var align: String = js.native
    var classes: js.Dictionary[String] = js.native
    var color: String = js.native
    var component: String = js.native
    var gutterBottom: Boolean = js.native
    var noWrap: Boolean = js.native
    var paragraph: Boolean = js.native
    var `type`: String = js.native
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
      align:        Alignment             = Alignment.inherit,
      classes:      Map[ClassKey, String] = Map.empty,
      color:        Color                 = Color.default,
      component:    String                = "div",
      gutterBottom: Boolean               = false,
      noWrap:       Boolean               = false,
      paragraph:    Boolean               = false,
      `type`:       Type                  = Type.body1)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.align = align
    p.classes = classes
    p.color = color
    p.component = component
    p.gutterBottom = gutterBottom
    p.noWrap = noWrap
    p.paragraph = paragraph
    p.`type` = `type`
    this.component(p)(children: _*)
  }
}
