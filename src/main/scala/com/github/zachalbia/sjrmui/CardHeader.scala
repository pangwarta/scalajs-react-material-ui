package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardHeader {

  @JSImport("material-ui", "CardHeader")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends CardContent.Props {
    var action: js.UndefOr[ReactElement] = js.native
    var avatar: js.UndefOr[ReactElement] = js.native
    var classes: js.Dictionary[String] = js.native
    var subheader: js.UndefOr[ReactElement] = js.native
    var title: js.UndefOr[ReactElement] = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object avatar extends ClassKey("avatar")
  object action extends ClassKey("action")
  object content extends ClassKey("content")
  object title extends ClassKey("title")
  object subheader extends ClassKey("subheader")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      action:    js.UndefOr[ReactElement] = js.undefined,
      avatar:    js.UndefOr[ReactElement] = js.undefined,
      classes:   Map[ClassKey, String]    = Map.empty,
      subheader: js.UndefOr[ReactElement] = js.undefined,
      title:     js.UndefOr[ReactElement] = js.undefined)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.action = action
    p.avatar = avatar
    p.classes = classes
    p.subheader = subheader
    p.title = title
    component(p)(children: _*)
  }
}
