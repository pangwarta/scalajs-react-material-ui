package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardContent {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    className: js.UndefOr[String] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(className, otherProps: _*)
    component(p)(children: _*)
  }

  private def props(className: js.UndefOr[String], otherProps: (String, js.Any)*): Props = {
    val p = js.Dynamic.literal()
    className.foreach(p.updateDynamic("className")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var className: js.UndefOr[String] = js.native
  }

  @JSImport("@material-ui/core", "CardContent")
  @js.native
  private object RawComponent extends js.Object
}
