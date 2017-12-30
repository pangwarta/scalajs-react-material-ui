package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object BottomNavigation {

  @JSImport("material-ui", "BottomNavigation")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props[A] extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var onChange: OnJSEv2[ReactEvent, A] = js.native
    var showLabels: Boolean = js.native
    var value: A = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private def component[A] = JsComponent[Props[A], Children.Varargs, Null](RawComponent)

  def apply[A](
      classes:    Map[ClassKey, String]        = Map.empty,
      className:  js.UndefOr[String]           = js.undefined,
      onChange:   ReactHandler2[ReactEvent, A] = js.undefined,
      showLabels: Boolean                      = false,
      value:      A                            = 0)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props[A]]
    p.classes = classes
    p.className = className
    p.showLabels = showLabels
    p.onChange = onChange
    p.value = value
    this.component[A](p)(children: _*)
  }
}
