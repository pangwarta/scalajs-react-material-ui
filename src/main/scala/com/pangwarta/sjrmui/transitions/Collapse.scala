package com.pangwarta.sjrmui.transitions

import com.pangwarta.sjrmui.internal.Transition
import com.pangwarta.sjrmui._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Collapse {

  val auto = "auto"

  @JSImport("material-ui", "Collapse")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var appear: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var collapsedHeight: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | js.Function] = js.native
    var in: js.UndefOr[Boolean] = js.native
    var onEnter: OptJsFun1[html.Element] = js.native
    var onEntering: OptJsFun1[html.Element] = js.native
    var onEntered: OptJsFun1[html.Element] = js.native
    var onExit: OptJsFun1[html.Element] = js.native
    var onExiting: OptJsFun1[html.Element] = js.native
    var style: js.UndefOr[js.Object] = js.native
    var timeout: js.UndefOr[Transition.Duration | auto.type] = js.native
  }

  private def props(
      appear:          js.UndefOr[Boolean],
      classes:         js.Dictionary[String],
      className:       js.UndefOr[String],
      collapsedHeight: js.UndefOr[String],
      component:       js.UndefOr[String | js.Function],
      in:              js.UndefOr[Boolean],
      onEnter:         OptJsFun1[html.Element],
      onEntering:      OptJsFun1[html.Element],
      onEntered:       OptJsFun1[html.Element],
      onExit:          OptJsFun1[html.Element],
      onExiting:       OptJsFun1[html.Element],
      style:           js.UndefOr[js.Object],
      timeout:         js.UndefOr[Transition.Duration | auto.type],
      otherProps:      (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    appear.foreach(p.updateDynamic("appear")(_))
    className.foreach(p.updateDynamic("className")(_))
    collapsedHeight.foreach(p.updateDynamic("collapsedHeight")(_))
    component.foreach(p.updateDynamic("component")(_))
    in.foreach(p.updateDynamic("in")(_))
    onEnter.foreach(p.updateDynamic("onEnter")(_))
    onEntering.foreach(p.updateDynamic("onEntering")(_))
    onEntered.foreach(p.updateDynamic("onEntered")(_))
    onExit.foreach(p.updateDynamic("onExit")(_))
    onExiting.foreach(p.updateDynamic("onExiting")(_))
    style.foreach(p.updateDynamic("style")(_))
    timeout.foreach(p.updateDynamic("timeout")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object container extends ClassKey("container")
  object entered extends ClassKey("entered")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      appear:          js.UndefOr[Boolean]                         = js.undefined,
      classes:         Map[ClassKey, String]                       = Map.empty,
      className:       js.UndefOr[String]                          = js.undefined,
      collapsedHeight: js.UndefOr[String]                          = js.undefined,
      component:       js.UndefOr[String | js.Function]            = js.undefined,
      in:              js.UndefOr[Boolean]                         = js.undefined,
      onEnter:         Handler1[html.Element]                      = js.undefined,
      onEntering:      Handler1[html.Element]                      = js.undefined,
      onEntered:       Handler1[html.Element]                      = js.undefined,
      onExit:          Handler1[html.Element]                      = js.undefined,
      onExiting:       Handler1[html.Element]                      = js.undefined,
      style:           js.UndefOr[js.Object]                       = js.undefined,
      timeout:         js.UndefOr[Transition.Duration | auto.type] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      appear,
      classes,
      className,
      collapsedHeight,
      component,
      in,
      onEnter,
      onEntering,
      onEntered,
      onExit,
      onExiting,
      style,
      timeout,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
