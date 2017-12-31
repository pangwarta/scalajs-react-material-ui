package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardContent {

  @JSImport("material-ui", "CardContent")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
  }

  private def props(className: js.UndefOr[String], otherProps: (String, js.Any)*): Props = {
    val p = js.Dynamic.literal(className = className)
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      className: js.UndefOr[String] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(className, otherProps: _*)
    component(p)(children: _*)
  }
}
