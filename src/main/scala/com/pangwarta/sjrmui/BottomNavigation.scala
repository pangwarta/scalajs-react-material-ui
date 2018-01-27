package com.pangwarta.sjrmui

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
    var showLabels: js.UndefOr[Boolean] = js.native
    var value: js.UndefOr[A] = js.native
  }

  private def props[A](
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      onChange:   OnJSEv2[ReactEvent, A],
      showLabels: js.UndefOr[Boolean],
      value:      js.UndefOr[A],
      otherProps: (String, js.Any)*
  ): Props[A] = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(v => p.updateDynamic("className")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    showLabels.foreach(v => p.updateDynamic("showLabels")(v))
    value.foreach(v => p.updateDynamic("value")(v.asInstanceOf[js.Any]))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props[A]]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private def component[A] = JsComponent[Props[A], Children.Varargs, Null](RawComponent)

  def apply[A](
      classes:    Map[ClassKey, String]        = Map.empty,
      className:  js.UndefOr[String]           = js.undefined,
      onChange:   ReactHandler2[ReactEvent, A] = js.undefined,
      showLabels: js.UndefOr[Boolean]          = js.undefined,
      value:      js.UndefOr[A]                = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      onChange,
      showLabels,
      value,
      otherProps: _*
    )
    component[A](p)(children: _*)
  }
}
