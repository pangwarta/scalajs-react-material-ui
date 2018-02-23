package com.pangwarta.sjrmui.transitions

import com.pangwarta.sjrmui._
import internal.Transition
import org.scalajs.dom.html
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Slide {

  @JSImport("material-ui", "Fade")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends Transition.Props {
    var direction: String = js.native
    var theme: js.UndefOr[js.Object] = js.native
    var timeout: js.UndefOr[Transition.Duration] = js.native
  }

  abstract case class Direction(get: String) extends StringType
  object left extends Direction("left")
  object right extends Direction("right")
  object up extends Direction("up")
  object down extends Direction("down")

  def props(
      direction:  js.UndefOr[String],
      in:         js.UndefOr[Boolean],
      onEnter:    OptJsFun1[html.Element],
      onEntered:  OptJsFun1[html.Element],
      onEntering: OptJsFun1[html.Element],
      onExit:     OptJsFun1[html.Element],
      onExited:   OptJsFun1[html.Element],
      onExiting:  OptJsFun1[html.Element],
      style:      js.UndefOr[js.Object],
      theme:      js.UndefOr[js.Object],
      timeout:    js.UndefOr[Transition.Duration],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    direction.foreach(p.updateDynamic("direction")(_))
    in.foreach(p.updateDynamic("in")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExited.foreach(p.updateDynamic("onExited")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    style.foreach(p.updateDynamic("style")(_))
    theme.foreach(p.updateDynamic("theme")(_))
    timeout.foreach(p.updateDynamic("timeout")(_))
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      direction:  js.UndefOr[Direction]           = js.undefined,
      in:         js.UndefOr[Boolean]             = js.undefined,
      onEnter:    OptJsFun1[html.Element]         = js.undefined,
      onEntered:  OptJsFun1[html.Element]         = js.undefined,
      onEntering: OptJsFun1[html.Element]         = js.undefined,
      onExit:     OptJsFun1[html.Element]         = js.undefined,
      onExited:   OptJsFun1[html.Element]         = js.undefined,
      onExiting:  OptJsFun1[html.Element]         = js.undefined,
      style:      js.UndefOr[js.Object]           = js.undefined,
      theme:      js.UndefOr[js.Object]           = js.undefined,
      timeout:    js.UndefOr[Transition.Duration]
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      direction,
      in,
      onEnter,
      onEntered,
      onEntering,
      onExit,
      onExited,
      onExiting,
      style,
      theme,
      timeout,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
