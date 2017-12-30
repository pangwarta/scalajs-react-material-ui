package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Badge {

  @JSImport("material-ui", "Badge")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Color(get: String) extends StringType
  object Color {
    object default extends Color("default")
    object primary extends Color("primary")
    object accent extends Color("accent")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var badgeContent: js.UndefOr[String | ReactElement] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var color: String = js.native
  }

  private def props(
      badgeContent: js.UndefOr[String | ReactElement],
      classes:      js.Dictionary[String],
      className:    js.UndefOr[String],
      color:        String,
      otherProps:   (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      badgeContent = badgeContent,
      classes      = classes,
      className    = className,
      color        = color
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object badge extends ClassKey("badge")
  object colorPrimary extends ClassKey("colorPrimary")
  object colorAccent extends ClassKey("colorAccent")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      badgeContent: js.UndefOr[String | ReactElement] = js.undefined,
      classes:      Map[ClassKey, String]             = Map.empty,
      className:    js.UndefOr[String]                = js.undefined,
      color:        Color                             = Color.default
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      badgeContent,
      classes,
      className,
      color,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
