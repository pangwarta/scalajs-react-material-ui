package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.{ ReactElement, ReactNode }
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Input {

  @JSImport("material-ui", "Input")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
    var autoComplete: js.UndefOr[String] = js.native
    var autoFocus: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var defaultValue: js.UndefOr[String | Double] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disableUnderline: js.UndefOr[Boolean] = js.native
    var endAdornment: js.UndefOr[ReactNode] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var fullWidth: js.UndefOr[Boolean] = js.native
    var id: js.UndefOr[String] = js.native
    var inputComponent: js.UndefOr[String | ReactElement] = js.native
    var inputProps: js.UndefOr[js.Object] = js.native // TODO: How to use React.InputHTMLAttributes?
    var inputRef: js.UndefOr[js.Function1[html.Input, Unit]] = js.native
    var margin: js.UndefOr[String] = js.native
    var multiline: js.UndefOr[Boolean] = js.native
    var name: js.UndefOr[String] = js.native
    var onBlur: OnJSEv1[ReactEvent] = js.native
    var onChange: OnJSEv1[ReactEventFromHtml] = js.native
    var onClean: js.UndefOr[js.Function0[Unit]] = js.native
    var onDirty: js.UndefOr[js.Function0[Unit]] = js.native
    var onFocus: OnJSEv1[ReactEvent] = js.native
    var onKeyDown: OnJSEv1[ReactKeyboardEventFromHtml] = js.native
    var onKeyUp: OnJSEv1[ReactKeyboardEventFromHtml] = js.native
    var placeholder: js.UndefOr[String] = js.native
    var readOnly: js.UndefOr[Boolean] = js.native
    var rows: js.UndefOr[String | Int] = js.native
    var rowsMax: js.UndefOr[String | Int] = js.native
    var startAdornment: js.UndefOr[ReactNode] = js.native
    var `type`: js.UndefOr[String] = js.native
    var value: js.UndefOr[js.Array[String | Double] | String | Double] = js.native
  }

  private def props(
      autoComplete:     js.UndefOr[String],
      autoFocus:        js.UndefOr[Boolean],
      classes:          js.Dictionary[String],
      className:        js.UndefOr[String],
      defaultValue:     js.UndefOr[String | Double],
      disabled:         js.UndefOr[Boolean],
      disableUnderline: js.UndefOr[Boolean],
      endAdornment:     js.UndefOr[ReactNode],
      error:            js.UndefOr[Boolean],
      fullWidth:        js.UndefOr[Boolean],
      id:               js.UndefOr[String],
      inputComponent:   js.UndefOr[String | ReactElement],
      inputProps:       js.UndefOr[js.Object],
      inputRef:         js.UndefOr[js.Function1[html.Input, Unit]],
      margin:           js.UndefOr[String],
      multiline:        js.UndefOr[Boolean],
      name:             js.UndefOr[String],
      onBlur:           OnJSEv1[ReactEvent],
      onChange:         OnJSEv1[ReactEventFromHtml],
      onClean:          js.UndefOr[js.Function0[Unit]],
      onDirty:          js.UndefOr[js.Function0[Unit]],
      onFocus:          OnJSEv1[ReactEvent],
      onKeyDown:        OnJSEv1[ReactKeyboardEventFromHtml],
      onKeyUp:          OnJSEv1[ReactKeyboardEventFromHtml],
      placeholder:      js.UndefOr[String],
      readOnly:         js.UndefOr[Boolean],
      rows:             js.UndefOr[String | Int],
      rowsMax:          js.UndefOr[String | Int],
      startAdornment:   js.UndefOr[ReactNode],
      `type`:           js.UndefOr[String],
      value:            js.UndefOr[js.Array[String | Double] | String | Double],
      otherProps:       (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    autoComplete.foreach(p.updateDynamic("autoComplete")(_))
    autoFocus.foreach(p.updateDynamic("autoFocus")(_))
    className.foreach(p.updateDynamic("className")(_))
    defaultValue.foreach(p.updateDynamic("defaultValue")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableUnderline.foreach(p.updateDynamic("disableUnderline")(_))
    endAdornment.foreach(p.updateDynamic("endAdornment")(_))
    error.foreach(p.updateDynamic("error")(_))
    fullWidth.foreach(p.updateDynamic("fullWidth")(_))
    id.foreach(p.updateDynamic("id")(_))
    inputComponent.foreach(p.updateDynamic("inputComponent")(_))
    inputProps.foreach(p.updateDynamic("inputProps")(_))
    inputRef.foreach(p.updateDynamic("inputRef")(_))
    margin.foreach(p.updateDynamic("margin")(_))
    multiline.foreach(p.updateDynamic("multiline")(_))
    name.foreach(p.updateDynamic("name")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    onClean.foreach(p.updateDynamic("onClean")(_))
    onDirty.foreach(p.updateDynamic("onDirty")(_))
    onFocus.foreach(p.updateDynamic("onFocus")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    onKeyUp.foreach(p.updateDynamic("onKeyUp")(_))
    placeholder.foreach(p.updateDynamic("placeholder")(_))
    readOnly.foreach(p.updateDynamic("readOnly")(_))
    rows.foreach(p.updateDynamic("rows")(_))
    rowsMax.foreach(p.updateDynamic("rowsMax")(_))
    startAdornment.foreach(p.updateDynamic("startAdornment")(_))
    `type`.foreach(p.updateDynamic("`type`")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object formControl extends ClassKey("formControl")
  object inkbar extends ClassKey("inkbar")
  object error extends ClassKey("error")
  object input extends ClassKey("input")
  object inputDense extends ClassKey("inputDense")
  object disabled extends ClassKey("disabled")
  object focused extends ClassKey("focused")
  object underline extends ClassKey("underline")
  object multiline extends ClassKey("multiline")
  object inputDisabled extends ClassKey("inputDisabled")
  object inputSingleline extends ClassKey("inputSingleline")
  object inputSearch extends ClassKey("inputSearch")
  object inputMultiline extends ClassKey("inputMultiline")
  object fullWidth extends ClassKey("fullWidth")

  def apply(
      autoComplete:     js.UndefOr[String]                                      = js.undefined,
      autoFocus:        js.UndefOr[Boolean]                                     = js.undefined,
      classes:          Map[ClassKey, String]                                   = Map.empty,
      className:        js.UndefOr[String]                                      = js.undefined,
      defaultValue:     js.UndefOr[String | Double]                             = js.undefined,
      disabled:         js.UndefOr[Boolean]                                     = js.undefined,
      disableUnderline: js.UndefOr[Boolean]                                     = js.undefined,
      endAdornment:     js.UndefOr[ReactNode]                                   = js.undefined,
      error:            js.UndefOr[Boolean]                                     = js.undefined,
      fullWidth:        js.UndefOr[Boolean]                                     = js.undefined,
      id:               js.UndefOr[String]                                      = js.undefined,
      inputComponent:   js.UndefOr[String | ReactElement]                       = js.undefined,
      inputProps:       js.UndefOr[js.Object]                                   = js.undefined,
      inputRef:         js.UndefOr[js.Function1[html.Input, Unit]]              = js.undefined,
      margin:           js.UndefOr[String]                                      = js.undefined,
      multiline:        js.UndefOr[Boolean]                                     = js.undefined,
      name:             js.UndefOr[String]                                      = js.undefined,
      onBlur:           ReactHandler1[ReactEvent]                               = js.undefined,
      onChange:         ReactHandler1[ReactEventFromHtml]                       = js.undefined,
      onClean:          js.UndefOr[js.Function0[Unit]]                          = js.undefined,
      onDirty:          js.UndefOr[js.Function0[Unit]]                          = js.undefined,
      onFocus:          ReactHandler1[ReactEvent]                               = js.undefined,
      onKeyDown:        ReactHandler1[ReactKeyboardEventFromHtml]               = js.undefined,
      onKeyUp:          ReactHandler1[ReactKeyboardEventFromHtml]               = js.undefined,
      placeholder:      js.UndefOr[String]                                      = js.undefined,
      readOnly:         js.UndefOr[Boolean]                                     = js.undefined,
      rows:             js.UndefOr[String | Int]                                = js.undefined,
      rowsMax:          js.UndefOr[String | Int]                                = js.undefined,
      startAdornment:   js.UndefOr[ReactNode]                                   = js.undefined,
      `type`:           js.UndefOr[String]                                      = js.undefined,
      value:            js.UndefOr[js.Array[String | Double] | String | Double] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      autoComplete,
      autoFocus,
      classes,
      className,
      defaultValue,
      disabled,
      disableUnderline,
      endAdornment,
      error,
      fullWidth,
      id,
      inputComponent,
      inputProps,
      inputRef,
      margin,
      multiline,
      name,
      onBlur,
      onChange,
      onClean,
      onDirty,
      onFocus,
      onKeyDown,
      onKeyUp,
      placeholder,
      readOnly,
      rows,
      rowsMax,
      startAdornment,
      `type`,
      value,
      otherProps: _*
    )
    component(p)
  }
}
