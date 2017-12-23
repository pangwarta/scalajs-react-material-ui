package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Checkbox {

  @JSImport("material-ui", "Checkbox")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var checked: js.UndefOr[Boolean | String] = js.native
    var checkedIcon: js.UndefOr[ReactElement] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var defaultChecked: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disableRipple: js.UndefOr[Boolean] = js.native
    var icon: js.UndefOr[ReactElement] = js.native
    var indeterminate: Boolean = js.native
    // TODO: var indeterminateIcon: IndeterminateIcon = js.native
    var inputProps: js.Dictionary[String] = js.native
    // TODO: var inputRef: ? = js.native
    var name: js.UndefOr[String] = js.native
    var onChange: OnJS2[ReactEvent, Boolean] = js.native
    var tabIndex: js.UndefOr[Int | String] = js.native
    var value: js.UndefOr[String] = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object default extends ClassKey("default")
  object checked extends ClassKey("checked")
  object disabled extends ClassKey("disabled")

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
      checked:        js.UndefOr[Boolean | String]  = js.undefined,
      checkedIcon:    js.UndefOr[ReactElement]      = js.undefined,
      classes:        Map[ClassKey, String]         = Map.empty,
      className:      js.UndefOr[String]            = js.undefined,
      defaultChecked: js.UndefOr[Boolean]           = js.undefined,
      disabled:       js.UndefOr[Boolean]           = js.undefined,
      disableRipple:  js.UndefOr[Boolean]           = js.undefined,
      icon:           js.UndefOr[ReactElement]      = js.undefined,
      indeterminate:  Boolean                       = false,
      inputProps:     Map[String, String]           = Map.empty,
      name:           js.UndefOr[String]            = js.undefined,
      onChange:       Handler2[ReactEvent, Boolean] = js.undefined,
      tabIndex:       js.UndefOr[Int | String]      = js.undefined,
      value:          js.UndefOr[String]            = js.undefined) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.checked = checked
    p.checkedIcon = checkedIcon
    p.classes = classes
    p.className = className
    p.defaultChecked = defaultChecked
    p.disabled = disabled
    p.disableRipple = disableRipple
    p.icon = icon
    p.indeterminate = indeterminate
    p.inputProps = inputProps
    p.name = name
    p.onChange = onChange
    p.tabIndex = tabIndex
    p.value = value
    component(p)
  }
}
