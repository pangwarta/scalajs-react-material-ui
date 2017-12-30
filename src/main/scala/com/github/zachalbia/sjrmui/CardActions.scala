package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardActions {

  @JSImport("material-ui", "CardActions")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableActionSpacing: Boolean = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object action extends ClassKey("action")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:              Map[ClassKey, String] = Map.empty,
      className:            js.UndefOr[String]    = js.undefined,
      disableActionSpacing: Boolean               = false
  )(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.classes = classes
    p.className = className
    p.disableActionSpacing = disableActionSpacing
    component(p)(children: _*)
  }
}
