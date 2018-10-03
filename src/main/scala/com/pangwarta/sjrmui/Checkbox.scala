package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{RefFn, Element => ReactElement, Node => ReactNode}
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Checkbox {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
    checked: js.UndefOr[Boolean | String] = js.undefined,
    checkedIcon: js.UndefOr[ReactElement] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disableRipple: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[ReactElement] = js.undefined,
    indeterminate: js.UndefOr[Boolean] = js.undefined,
    indeterminateIcon: js.UndefOr[ReactNode | String] = js.undefined,
    inputProps: Map[String, String] = Map.empty,
    inputRef: js.UndefOr[RefFn[String]] = js.undefined,
    name: js.UndefOr[String] = js.undefined,
    onChange: ReactHandler2[ReactEvent, Boolean] = js.undefined,
    tabIndex: js.UndefOr[Int | String] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      checked,
      checkedIcon,
      classes,
      className,
      defaultChecked,
      disabled,
      disableRipple,
      icon,
      indeterminate,
      indeterminateIcon,
      inputProps,
      inputRef,
      name,
      onChange,
      tabIndex,
      value,
      otherProps: _*
    )
    component(p)
  }

  private def props(
    checked: js.UndefOr[Boolean | String],
    checkedIcon: js.UndefOr[ReactNode],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    defaultChecked: js.UndefOr[Boolean],
    disabled: js.UndefOr[Boolean],
    disableRipple: js.UndefOr[Boolean],
    icon: js.UndefOr[ReactElement],
    indeterminate: js.UndefOr[Boolean],
    indeterminateIcon: js.UndefOr[ReactNode | String],
    inputProps: js.Dictionary[String],
    inputRef: js.UndefOr[js.Function],
    name: js.UndefOr[String],
    onChange: OnJSEv2[ReactEvent, Boolean],
    tabIndex: js.UndefOr[Int | String],
    value: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes = classes,
      inputProps = inputProps
    )
    checked.foreach(p.updateDynamic("checked")(_))
    checkedIcon.foreach(p.updateDynamic("checkedIcon")(_))
    className.foreach(p.updateDynamic("className")(_))
    defaultChecked.foreach(p.updateDynamic("defaultChecked")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableRipple.foreach(p.updateDynamic("disableRipple")(_))
    icon.foreach(p.updateDynamic("icon")(_))
    indeterminate.foreach(p.updateDynamic("indeterminate")(_))
    indeterminateIcon.foreach(p.updateDynamic("indeterminateIcon")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    name.foreach(p.updateDynamic("name")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var checked: js.UndefOr[Boolean | String]             = js.native
    var checkedIcon: js.UndefOr[ReactNode]                = js.native
    var classes: js.Dictionary[String]                    = js.native
    var className: js.UndefOr[String]                     = js.native
    var defaultChecked: js.UndefOr[Boolean]               = js.native
    var disabled: js.UndefOr[Boolean]                     = js.native
    var disableRipple: js.UndefOr[Boolean]                = js.native
    var icon: js.UndefOr[ReactElement]                    = js.native
    var indeterminate: js.UndefOr[Boolean]                = js.native
    var indeterminateIcon: js.UndefOr[ReactNode | String] = js.native
    var inputProps: js.Dictionary[String]                 = js.native
    var inputRef: js.UndefOr[RefFn[String]]               = js.native
    var inputType: js.UndefOr[String]                     = js.native
    var name: js.UndefOr[String]                          = js.native
    var onChange: OnJSEv2[ReactEvent, Boolean]            = js.native
    var tabIndex: js.UndefOr[Int | String]                = js.native
    var value: js.UndefOr[String]                         = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object default                                   extends ClassKey("default")

  object checked                                   extends ClassKey("checked")

  object disabled                                  extends ClassKey("disabled")

  @JSImport("@material-ui/core", "Checkbox")
  @js.native
  private object RawComponent extends js.Object
}
