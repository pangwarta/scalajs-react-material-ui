package com.github.zachalbia.sjrmui

import com.github.zachalbia.sjrmui.Paper.ClassKey
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

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      raised:    Boolean               = false,
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement = "div",
      elevation: Int                   = 2,
      square:    Boolean               = false
  )(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.className = className
    p.component = component
    p.elevation = elevation
    p.square = square
    p.raised = raised
    this.component(p)(children: _*)
  }
}
