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
    var color: String = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object badge extends ClassKey("badge")
  object colorPrimary extends ClassKey("colorPrimary")
  object colorAccent extends ClassKey("colorAccent")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      badgeContent: Option[String | ReactElement] = None,
      classes:      Map[ClassKey, String]         = Map.empty,
      color:        Color                         = Color.default)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.badgeContent = badgeContent
    p.classes = classes
    p.color = color
    this.component(p)(children: _*)
  }
}
