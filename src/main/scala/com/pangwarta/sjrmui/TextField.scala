package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.{ ReactNode, RefFn }
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.{ JSImport, JSName }
import scala.scalajs.js.|

object TextField {

  @JSImport("material-ui", "TextField")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var className: js.UndefOr[String] = js.native
    var defaultValue: js.UndefOr[String | Double] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var FormHelperTextProps: js.UndefOr[FormHelperText.Props] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var helperText: js.UndefOr[ReactNode] = js.native
    var helperTextClassName: js.UndefOr[String] = js.native
    var id: js.UndefOr[String] = js.native
    var InputLabelProps: js.UndefOr[InputLabel.Props] = js.native
    var InputProps: js.UndefOr[Input.Props] = js.native
    var inputProps: js.UndefOr[js.Object] = js.native
    var inputRef: js.UndefOr[RefFn] = js.native
    var label: js.UndefOr[ReactNode] = js.native
    var labelClassName: js.UndefOr[String] = js.native
    var margin: js.UndefOr[String] = js.native
    var multiline: js.UndefOr[Boolean] = js.native
    var name: js.UndefOr[String] = js.native
    var onChange: OnJSEv1[ReactEvent] = js.native
    var placeholder: js.UndefOr[String] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var rows: js.UndefOr[String | Int] = js.native
    var rowsMax: js.UndefOr[String | Int] = js.native
    var select: js.UndefOr[Boolean] = js.native
    var SelectProps: js.UndefOr[Select.Props] = js.native
    @JSName("type")
    var typ: js.UndefOr[String] = js.native
    var value: js.UndefOr[js.Array[String | Double] | String | Double] = js.native
  }

  sealed abstract case class Margin(get: String) extends StringType
  object none extends Margin("none")
  object dense extends Margin("dense")
  object normal extends Margin("normal")

  private def props(
      autoComplete:        js.UndefOr[String],
      autoFocus:           js.UndefOr[Boolean],
      className:           js.UndefOr[String],
      defaultValue:        js.UndefOr[String | Double],
      disabled:            js.UndefOr[Boolean],
      error:               js.UndefOr[Boolean],
      FormHelperTextProps: js.UndefOr[FormHelperText.Props],
      fullWidth:           js.UndefOr[Boolean],
      helperText:          js.UndefOr[ReactNode],
      helperTextClassName: js.UndefOr[String],
      id:                  js.UndefOr[String],
      InputLabelProps:     js.UndefOr[InputLabel.Props],
      InputProps:          js.UndefOr[Input.Props],
      inputProps:          js.UndefOr[js.Object],
      inputRef:            js.UndefOr[RefFn],
      label:               js.UndefOr[ReactNode],
      labelClassName:      js.UndefOr[String],
      margin:              js.UndefOr[String],
      multiline:           js.UndefOr[Boolean],
      name:                js.UndefOr[String],
      onChange:            OnJSEv1[ReactEvent],
      placeholder:         js.UndefOr[String],
      required:            js.UndefOr[Boolean],
      rows:                js.UndefOr[String | Int],
      rowsMax:             js.UndefOr[String | Int],
      select:              js.UndefOr[Boolean],
      SelectProps:         js.UndefOr[Select.Props],
      typ:                 js.UndefOr[String],
      value:               js.UndefOr[js.Array[String | Double] | String | Double],
      otherProps:          (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    autoComplete.foreach(p.updateDynamic("autoComplete")(_))
    autoFocus.foreach(p.updateDynamic("autoFocus")(_))
    className.foreach(p.updateDynamic("className")(_))
    defaultValue.foreach(p.updateDynamic("defaultValue")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    error.foreach(p.updateDynamic("error")(_))
    FormHelperTextProps.foreach(p.updateDynamic("FormHelperTextProps")(_))
    fullWidth.foreach(p.updateDynamic("fullWidth")(_))
    helperText.foreach(p.updateDynamic("helperText")(_))
    helperTextClassName.foreach(p.updateDynamic("helperTextClassName")(_))
    id.foreach(p.updateDynamic("id")(_))
    InputLabelProps.foreach(p.updateDynamic("InputLabelProps")(_))
    InputProps.foreach(p.updateDynamic("InputProps")(_))
    inputProps.foreach(p.updateDynamic("inputProps")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    label.foreach(p.updateDynamic("label")(_))
    labelClassName.foreach(p.updateDynamic("labelClassName")(_))
    margin.foreach(p.updateDynamic("margin")(_))
    multiline.foreach(p.updateDynamic("multiline")(_))
    name.foreach(p.updateDynamic("name")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    placeholder.foreach(p.updateDynamic("placeholder")(_))
    required.foreach(p.updateDynamic("required")(_))
    rows.foreach(p.updateDynamic("rows")(_))
    rowsMax.foreach(p.updateDynamic("rowsMax")(_))
    select.foreach(p.updateDynamic("select")(_))
    SelectProps.foreach(p.updateDynamic("SelectProps")(_))
    typ.foreach(p.updateDynamic("type")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      autoComplete:        js.UndefOr[String]                                      = js.undefined,
      autoFocus:           js.UndefOr[Boolean]                                     = js.undefined,
      className:           js.UndefOr[String]                                      = js.undefined,
      defaultValue:        js.UndefOr[String | Double]                             = js.undefined,
      disabled:            js.UndefOr[Boolean]                                     = js.undefined,
      error:               js.UndefOr[Boolean]                                     = js.undefined,
      FormHelperTextProps: js.UndefOr[FormHelperText.Props]                        = js.undefined,
      fullWidth:           js.UndefOr[Boolean]                                     = js.undefined,
      helperText:          js.UndefOr[ReactNode]                                   = js.undefined,
      helperTextClassName: js.UndefOr[String]                                      = js.undefined,
      id:                  js.UndefOr[String]                                      = js.undefined,
      InputLabelProps:     js.UndefOr[InputLabel.Props]                            = js.undefined,
      InputProps:          js.UndefOr[Input.Props]                                 = js.undefined,
      inputProps:          js.UndefOr[js.Object]                                   = js.undefined,
      inputRef:            js.UndefOr[RefFn]                                       = js.undefined,
      label:               js.UndefOr[ReactNode]                                   = js.undefined,
      labelClassName:      js.UndefOr[String]                                      = js.undefined,
      margin:              js.UndefOr[String]                                      = js.undefined,
      multiline:           js.UndefOr[Boolean]                                     = js.undefined,
      name:                js.UndefOr[String]                                      = js.undefined,
      onChange:            ReactHandler1[ReactEvent]                               = js.undefined,
      placeholder:         js.UndefOr[String]                                      = js.undefined,
      required:            js.UndefOr[Boolean]                                     = js.undefined,
      rows:                js.UndefOr[String | Int]                                = js.undefined,
      rowsMax:             js.UndefOr[String | Int]                                = js.undefined,
      select:              js.UndefOr[Boolean]                                     = js.undefined,
      SelectProps:         js.UndefOr[Select.Props]                                = js.undefined,
      typ:                 js.UndefOr[String]                                      = js.undefined,
      value:               js.UndefOr[js.Array[String | Double] | String | Double] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      autoComplete,
      autoFocus,
      className,
      defaultValue,
      disabled,
      error,
      FormHelperTextProps,
      fullWidth,
      helperText,
      helperTextClassName,
      id,
      InputLabelProps,
      InputProps,
      inputProps,
      inputRef,
      label,
      labelClassName,
      margin,
      multiline,
      name,
      onChange,
      placeholder,
      required,
      rows,
      rowsMax,
      select,
      SelectProps,
      typ,
      value,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
