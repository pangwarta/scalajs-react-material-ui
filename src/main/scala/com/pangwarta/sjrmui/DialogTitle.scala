package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object DialogTitle {

  @JSImport("material-ui", "DialogTitle")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableTypography: Boolean = js.native
  }

  private def props(
      classes:           js.Dictionary[String],
      className:         js.UndefOr[String],
      disableTypography: Boolean,
      otherProps:        (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes           = classes,
      className         = className,
      disableTypography = disableTypography
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:           Map[String, String] = Map.empty,
      className:         js.UndefOr[String]  = js.undefined,
      disableTypography: Boolean             = false
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableTypography,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
