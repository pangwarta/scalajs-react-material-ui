package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object AppBar {

  @JSImport("material-ui", "AppBar")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Color(get: String) extends StringType
  object inherit extends Color("inherit")
  object primary extends Color("primary")
  object accent extends Color("accent")
  object default extends Color("default")

  sealed abstract case class Position(get: String) extends StringType
  object static extends Position("static")
  object fixed extends Position("fixed")
  object absolute extends Position("absolute")

  @js.native
  private[sjrmui] trait Props extends Paper.Props {
    var color: String = js.native
    var position: String = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object positionFixed extends ClassKey("positionFixed")
  object positionAbsolute extends ClassKey("positionAbsolute")
  object positionStatic extends ClassKey("positionStatic")
  object colorDefault extends ClassKey("colorDefault")
  object colorPrimary extends ClassKey("colorPrimary")
  object colorAccent extends ClassKey("colorAccent")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      component: String                = "div",
      elevation: Int                   = 2,
      square:    Boolean               = false,
      color:     Color                 = primary,
      position:  Position              = fixed)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.component = component
    p.elevation = elevation
    this.component(p)(children: _*)
  }
}
