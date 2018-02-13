package com.pangwarta.sjrmui.transitions

import com.pangwarta.sjrmui.internal.Transition
import com.pangwarta.sjrmui._
import org.scalajs.dom.html
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Grow {

  @JSImport("material-ui", "Grow")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends Transition.HandlerOpts {
    var appear: js.UndefOr[Boolean] = js.native
    var in: js.UndefOr[Boolean] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var timeout: js.UndefOr[Transition.Duration] = js.native
    var transitionClasses: js.UndefOr[Transition.Classes] = js.native
  }

  private def props(
      appear:            js.UndefOr[Boolean],
      in:                js.UndefOr[Boolean],
      onEnter:           OptJsFun1[html.Element],
      onEntering:        OptJsFun1[html.Element],
      onEntered:         OptJsFun1[html.Element],
      onExit:            OptJsFun1[html.Element],
      onExiting:         OptJsFun1[html.Element],
      onExited:          OptJsFun1[html.Element],
      style:             js.UndefOr[js.Object],
      timeout:           js.UndefOr[Transition.Duration],
      transitionClasses: js.UndefOr[Transition.Classes],
      otherProps:        (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    appear.foreach(p.updateDynamic("appear")(_))
    in.foreach(p.updateDynamic("in")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    onExited.foreach(p.updateDynamic("onExited")(_))
    style.foreach(p.updateDynamic("style")(_))
    timeout.foreach(p.updateDynamic("timeout")(_))
    transitionClasses.foreach(p.updateDynamic("transitionClasses")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      appear:            js.UndefOr[Boolean]             = js.undefined,
      in:                js.UndefOr[Boolean]             = js.undefined,
      onEnter:           Handler1[html.Element]          = js.undefined,
      onEntering:        Handler1[html.Element]          = js.undefined,
      onEntered:         Handler1[html.Element]          = js.undefined,
      onExit:            Handler1[html.Element]          = js.undefined,
      onExiting:         Handler1[html.Element]          = js.undefined,
      onExited:          Handler1[html.Element]          = js.undefined,
      style:             js.UndefOr[js.Object]           = js.undefined,
      timeout:           js.UndefOr[Transition.Duration] = js.undefined,
      transitionClasses: js.UndefOr[Transition.Classes]  = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      appear,
      in,
      onEnter,
      onEntering,
      onEntered,
      onExit,
      onExiting,
      onExited,
      style,
      timeout,
      transitionClasses,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
