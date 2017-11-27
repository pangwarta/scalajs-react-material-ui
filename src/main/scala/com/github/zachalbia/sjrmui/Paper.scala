package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Paper {

  @JSImport("material-ui", "Paper")
  @js.native
  object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var component: String = js.native
    var elevation: Int = js.native
    var square: Boolean = js.native
  }

  private def props(
    classes: js.Dictionary[String],
    component: String,
    elevation: Int,
    square: Boolean,
  ): Props = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.component = component
    p.elevation = elevation
    p.square = square
    p
  }

  val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[String, String] = Map.empty,
    component: String = "div",
    elevation: Int = 2,
    square: Boolean = false
  )(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.component = component
    p.elevation = elevation
    p.square = square
    this.component(p)(children: _*)
  }
}
