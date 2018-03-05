package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object TableFooter {

  @JSImport("material-ui", "TableFooter")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var component: js.UndefOr[String | ReactElement] = js.native
  }
  private def props(
      component:  js.UndefOr[String | ReactElement],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    component.foreach(p.updateDynamic("component")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }
  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      component: js.UndefOr[String | ReactElement] = js.undefined
  )
    (otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      component,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
