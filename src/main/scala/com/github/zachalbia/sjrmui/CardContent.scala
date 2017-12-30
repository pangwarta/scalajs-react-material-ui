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

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      className: js.UndefOr[String] = js.undefined
  )(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.className = className
    component(p)(children: _*)
  }
}
