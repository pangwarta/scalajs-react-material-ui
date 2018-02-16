package com.pangwarta.sjrmui

import transitions.Collapse
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object ExpansionPanel {

  @JSImport("material-ui", "ExpansionPanel")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var CollapseProps: js.UndefOr[Collapse.Props] = js.native
    var defaultExpanded: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var expanded: js.UndefOr[Boolean] = js.native
    var onChange: OnJSEv2[ReactEvent, Boolean] = js.native
  }

  private def props(
      classes:         js.Dictionary[String],
      className:       js.UndefOr[String],
      CollapseProps:   js.UndefOr[Collapse.Props],
      defaultExpanded: js.UndefOr[Boolean],
      disabled:        js.UndefOr[Boolean],
      expanded:        js.UndefOr[Boolean],
      onChange:        OnJSEv2[ReactEvent, Boolean],
      otherProps:      (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    CollapseProps.foreach(p.updateDynamic("CollapseProps")(_))
    defaultExpanded.foreach(p.updateDynamic("defaultExpanded")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    expanded.foreach(p.updateDynamic("expanded")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object expanded extends ClassKey("expanded")
  object disabled extends ClassKey("disabled")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:         Map[ClassKey, String]        = Map.empty,
      className:       js.UndefOr[String]           = js.undefined,
      CollapseProps:   js.UndefOr[Collapse.Props]   = js.undefined,
      defaultExpanded: js.UndefOr[Boolean]          = js.undefined,
      disabled:        js.UndefOr[Boolean]          = js.undefined,
      expanded:        js.UndefOr[Boolean]          = js.undefined,
      onChange:        OnJSEv2[ReactEvent, Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      CollapseProps,
      defaultExpanded,
      disabled,
      expanded,
      onChange,
      otherProps: _*
    )
    component(p)(children: _*)
  }
}
