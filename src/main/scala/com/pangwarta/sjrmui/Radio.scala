package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.{ ReactNode, RefFn }
import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Radio {

  @JSImport("material-ui", "Radio")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends SwitchBase.Props {
    var color: js.UndefOr[String] = js.native
  }

  sealed abstract case class Color(get: String) extends StringType
  object primary extends Color("primary")
  object secondary extends Color("secondary")

  private def props(
      checked:        js.UndefOr[Boolean | String],
      checkedIcon:    js.UndefOr[ReactNode],
      classes:        js.Dictionary[String],
      className:      js.UndefOr[String],
      color:          js.UndefOr[String],
      defaultChecked: js.UndefOr[Boolean],
      disabled:       js.UndefOr[Boolean],
      disableRipple:  js.UndefOr[Boolean],
      icon:           js.UndefOr[ReactNode],
      id:             js.UndefOr[String],
      inputProps:     js.UndefOr[js.Object],
      inputRef:       js.UndefOr[RefFn],
      name:           js.UndefOr[String],
      onChange:       OnJSEv2[ReactEvent, Boolean],
      tabIndex:       js.UndefOr[Int | String],
      `type`:         js.UndefOr[String],
      value:          js.UndefOr[String],
      otherProps:     (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    checked.foreach(p.updateDynamic("checked")(_))
    checkedIcon.foreach(p.updateDynamic("checkedIcon")(_))
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    defaultChecked.foreach(p.updateDynamic("defaultChecked")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableRipple.foreach(p.updateDynamic("disableRipple")(_))
    icon.foreach(p.updateDynamic("icon")(_))
    id.foreach(p.updateDynamic("id")(_))
    inputProps.foreach(p.updateDynamic("inputProps")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    name.foreach(p.updateDynamic("name")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
    `type`.foreach(p.updateDynamic("`type`")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  type ClassKey = SwitchBase.ClassKey

  def apply(
      checked:        js.UndefOr[Boolean | String]       = js.undefined,
      checkedIcon:    js.UndefOr[ReactNode]              = js.undefined,
      classes:        Map[ClassKey, String]              = Map.empty,
      className:      js.UndefOr[String]                 = js.undefined,
      color:          js.UndefOr[Color]                  = js.undefined,
      defaultChecked: js.UndefOr[Boolean]                = js.undefined,
      disabled:       js.UndefOr[Boolean]                = js.undefined,
      disableRipple:  js.UndefOr[Boolean]                = js.undefined,
      icon:           js.UndefOr[ReactNode]              = js.undefined,
      id:             js.UndefOr[String]                 = js.undefined,
      inputProps:     js.UndefOr[js.Object]              = js.undefined,
      inputRef:       js.UndefOr[RefFn]                  = js.undefined,
      name:           js.UndefOr[String]                 = js.undefined,
      onChange:       ReactHandler2[ReactEvent, Boolean] = js.undefined,
      tabIndex:       js.UndefOr[Int | String]           = js.undefined,
      `type`:         js.UndefOr[String]                 = js.undefined,
      value:          js.UndefOr[String]                 = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      checked,
      checkedIcon,
      classes,
      className,
      color,
      defaultChecked,
      disabled,
      disableRipple,
      icon,
      id,
      inputProps,
      inputRef,
      name,
      onChange,
      tabIndex,
      `type`,
      value,
      otherProps: _*
    )
    this.component(p)
  }
}
