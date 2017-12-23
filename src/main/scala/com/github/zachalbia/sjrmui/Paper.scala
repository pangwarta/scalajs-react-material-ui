package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Paper {

  @JSImport("material-ui", "Paper")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: String | ReactElement = js.native
    var elevation: Int = js.native
    var square: Boolean = js.native
  }

  private object Props {
    def apply(
        classes:    js.Dictionary[String],
        className:  js.UndefOr[String],
        component:  String | ReactElement,
        elevation:  Int,
        square:     Boolean,
        otherProps: (String, js.Any)*): Props = {
      val p = js.Dynamic.literal(
        classes   = classes,
        className = className,
        component = component,
        elevation = elevation,
        square    = square)
      addOtherProps(p, otherProps: _*)
      p.asInstanceOf[Props]
    }
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object rounded extends ClassKey("rounded")
  object shadow0 extends ClassKey("shadow0")
  object shadow1 extends ClassKey("shadow1")
  object shadow2 extends ClassKey("shadow2")
  object shadow3 extends ClassKey("shadow3")
  object shadow4 extends ClassKey("shadow4")
  object shadow5 extends ClassKey("shadow5")
  object shadow6 extends ClassKey("shadow6")
  object shadow7 extends ClassKey("shadow7")
  object shadow8 extends ClassKey("shadow8")
  object shadow9 extends ClassKey("shadow9")
  object shadow10 extends ClassKey("shadow10")
  object shadow11 extends ClassKey("shadow11")
  object shadow12 extends ClassKey("shadow12")
  object shadow13 extends ClassKey("shadow13")
  object shadow14 extends ClassKey("shadow14")
  object shadow15 extends ClassKey("shadow15")
  object shadow16 extends ClassKey("shadow16")
  object shadow17 extends ClassKey("shadow17")
  object shadow18 extends ClassKey("shadow18")
  object shadow19 extends ClassKey("shadow19")
  object shadow20 extends ClassKey("shadow20")
  object shadow21 extends ClassKey("shadow21")
  object shadow22 extends ClassKey("shadow22")
  object shadow23 extends ClassKey("shadow23")
  object shadow24 extends ClassKey("shadow24")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement = "div",
      elevation: Int                   = 2,
      square:    Boolean               = false)(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = Props(
      classes,
      className,
      component,
      elevation,
      square,
      otherProps: _*)
    this.component(p)(children: _*)
  }
}
