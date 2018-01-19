package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Portal {

  @JSImport("material-ui", "Portal")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var container: js.UndefOr[js.Any | js.Function] = js.native
    var onRendered: js.UndefOr[js.Function0[Unit]] = js.native
  }

  private def props(
      container:  js.UndefOr[js.Any | js.Function],
      onRendered: js.UndefOr[js.Function],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      container  = container,
      onRendered = onRendered
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      container:  js.UndefOr[js.Any | js.Function] = js.undefined,
      onRendered: js.UndefOr[js.Function0[Unit]]   = js.undefined
  )(children: VdomNode*) = {
    val p = props(container, onRendered)
    component(p)(children: _*)
  }
}
