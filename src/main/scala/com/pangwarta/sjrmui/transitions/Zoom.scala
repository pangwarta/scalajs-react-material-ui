package com.pangwarta.sjrmui.transitions

import com.pangwarta.sjrmui._
import internal.Transition
import org.scalajs.dom.html
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Zoom {

  @JSImport("material-ui", "Zoom")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: OptJsFun1[html.Element] = js.native
    var onExit: OptJsFun1[html.Element] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var theme: js.UndefOr[js.Object] = js.native
    var timeout: js.UndefOr[Transition.Duration] = js.native
  }

  private def props(
      in:         js.UndefOr[Boolean],
      onEnter:    OptJsFun1[html.Element],
      onExit:     OptJsFun1[html.Element],
      style:      js.UndefOr[js.Object],
      theme:      js.UndefOr[js.Object],
      timeout:    js.UndefOr[Transition.Duration],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    in.foreach(p.updateDynamic("in")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    style.foreach(p.updateDynamic("style")(_))
    theme.foreach(p.updateDynamic("theme")(_))
    timeout.foreach(p.updateDynamic("timeout")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      in:      js.UndefOr[Boolean]             = js.undefined,
      onEnter: OptJsFun1[html.Element]         = js.undefined,
      onExit:  OptJsFun1[html.Element]         = js.undefined,
      style:   js.UndefOr[js.Object]           = js.undefined,
      theme:   js.UndefOr[js.Object]           = js.undefined,
      timeout: js.UndefOr[Transition.Duration] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      in,
      onEnter,
      onExit,
      style,
      theme,
      timeout,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
