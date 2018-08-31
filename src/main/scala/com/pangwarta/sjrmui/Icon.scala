package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Icon {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    fontSize: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      color,
      fontSize,
      otherProps: _*
    )
    component(p)(children: _*)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    color: js.UndefOr[String],
    fontSize: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    fontSize.foreach(p.updateDynamic("fontSize")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
    var color: js.UndefOr[String]      = js.native
    var fontSize: js.UndefOr[Boolean]  = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  sealed abstract case class Color(get: String) extends StringType

  object root extends ClassKey("root")

  object colorSecondary extends ClassKey("colorSecondary")

  object colorAction extends ClassKey("colorAction")

  object colorDisabled extends ClassKey("colorDisabled")

  object colorError extends ClassKey("colorError")

  object colorPrimary extends ClassKey("colorPrimary")

  object fontSize extends ClassKey("fontSize")

  object inherit   extends Color("inherit")
  object secondary extends Color("secondary")
  object action    extends Color("action")
  object disabled  extends Color("disabled")
  object error     extends Color("error")
  object primary   extends Color("primary")

  @JSImport("@material-ui/core", "Icon")
  @js.native
  private object RawComponent extends js.Object
}
