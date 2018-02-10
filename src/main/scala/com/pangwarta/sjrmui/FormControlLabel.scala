package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.{ ReactElement, ReactNode, RefFn }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormControlLabel {

  @JSImport("material-ui", "FormControlLabel")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var checked: js.UndefOr[Boolean | String] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var control: js.UndefOr[ReactElement] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var inputRef: js.UndefOr[RefFn] = js.native
    var label: js.UndefOr[ReactNode] = js.native
    var name: js.UndefOr[String] = js.native
    var onChange: OnJSEv2[ReactEvent, Boolean] = js.native
    var value: js.UndefOr[String] = js.native
  }

  private def props(
      checked:    js.UndefOr[Boolean | String],
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      control:    js.UndefOr[ReactElement],
      disabled:   js.UndefOr[Boolean],
      inputRef:   js.UndefOr[RefFn],
      label:      js.UndefOr[ReactNode],
      name:       js.UndefOr[String],
      onChange:   OnJSEv2[ReactEvent, Boolean],
      value:      js.UndefOr[String],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    checked.foreach(p.updateDynamic("checked")(_))
    className.foreach(p.updateDynamic("className")(_))
    control.foreach(p.updateDynamic("control")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    label.foreach(p.updateDynamic("label")(_))
    name.foreach(p.updateDynamic("name")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object disabled extends ClassKey("disabled")
  object label extends ClassKey("label")

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
      checked:   js.UndefOr[Boolean | String] = js.undefined,
      classes:   Map[ClassKey, String]        = Map.empty,
      className: js.UndefOr[String]           = js.undefined,
      control:   js.UndefOr[ReactElement]     = js.undefined,
      disabled:  js.UndefOr[Boolean]          = js.undefined,
      inputRef:  js.UndefOr[RefFn]            = js.undefined,
      label:     js.UndefOr[ReactNode]        = js.undefined,
      name:      js.UndefOr[String]           = js.undefined,
      onChange:  OnJSEv2[ReactEvent, Boolean] = js.undefined,
      value:     js.UndefOr[String]           = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      checked,
      classes,
      className,
      control,
      disabled,
      inputRef,
      label,
      name,
      onChange,
      value,
      otherProps: _*
    )
    this.component(p)
  }
}
