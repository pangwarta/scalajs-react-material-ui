package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MenuItem {

  @JSImport("material-ui", "MenuItem")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var role: js.UndefOr[String] = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      component:  js.UndefOr[String | ReactElement],
      role:       js.UndefOr[String],
      selected:   js.UndefOr[Boolean],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    role.foreach(p.updateDynamic("role")(_))
    selected.foreach(p.updateDynamic("selected")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object button extends ClassKey("button")
  object container extends ClassKey("container")
  object default extends ClassKey("default")
  object dense extends ClassKey("dense")
  object disabled extends ClassKey("disabled")
  object divider extends ClassKey("divider")
  object gutters extends ClassKey("gutters")
  object keyboardFocused extends ClassKey("keyboardFocused")
  object root extends ClassKey("root")
  object secondaryAction extends ClassKey("secondaryAction")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String]             = Map.empty,
      className: js.UndefOr[String]                = js.undefined,
      component: js.UndefOr[String | ReactElement] = js.undefined,
      role:      js.UndefOr[String]                = js.undefined,
      selected:  js.UndefOr[Boolean]               = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      role,
      selected,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
