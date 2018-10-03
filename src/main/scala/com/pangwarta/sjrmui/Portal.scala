package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Portal {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    container: js.UndefOr[js.Any | js.Function] = js.undefined,
    onRendered: js.UndefOr[js.Function0[Unit]] = js.undefined
  )(children: VdomNode*) = {
    val p = props(container, onRendered)
    component(p)(children: _*)
  }

  private def props(
    container: js.UndefOr[js.Any | js.Function],
    onRendered: js.UndefOr[js.Function],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    container.foreach(p.updateDynamic("container")(_))
    onRendered.foreach(p.updateDynamic("onRendered")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var container: js.UndefOr[js.Any | js.Function] = js.native
    var onRendered: js.UndefOr[js.Function0[Unit]]  = js.native
  }

  @JSImport("@material-ui/core", "Portal")
  @js.native
  private object RawComponent extends js.Object
}
