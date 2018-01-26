package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.Paper.ClassKey
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Card {

  @JSImport("material-ui", "Card")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends Paper.Props {
    var raised: Boolean = js.native
  }

  private def props(
      raised:     js.UndefOr[Boolean],
      classes:    Map[ClassKey, String],
      className:  js.UndefOr[String],
      component:  js.UndefOr[String | ReactElement],
      elevation:  js.UndefOr[Int],
      square:     js.UndefOr[Boolean],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    raised.foreach(p.updateDynamic("raised")(_))
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    elevation.foreach(p.updateDynamic("elevation")(_))
    square.foreach(p.updateDynamic("square")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      raised:    Boolean               = false,
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement = "div",
      elevation: Int                   = 2,
      square:    Boolean               = false
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      raised,
      classes,
      className,
      component,
      elevation,
      square,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
