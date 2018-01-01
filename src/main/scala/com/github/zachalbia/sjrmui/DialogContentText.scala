package com.github.zachalbia.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object DialogContentText {

  @JSImport("material-ui", "DialogContentText")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes    = classes,
      className  = className,
      otherProps = otherProps
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[String, String] = Map.empty,
      className: js.UndefOr[String]  = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
