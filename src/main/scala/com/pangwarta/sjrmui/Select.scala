package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.{ ReactElement, ReactNode }
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Select {

  @JSImport("material-ui", "Select")
  @js.native
  private object RawComponent extends js.Object

  type Value = js.Array[String | Double] | String | Double

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var autoWidth: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var displayEmpty: js.UndefOr[Boolean] = js.native
    var input: js.UndefOr[ReactNode] = js.native
    var inputProps: js.UndefOr[js.Object] = js.native
    var MenuProps: js.UndefOr[Menu.Props] = js.native
    var multiple: js.UndefOr[Boolean] = js.native
    var native: js.UndefOr[Boolean] = js.native
    var onChange: OnJSEv2[ReactEventFromHtml, ReactElement] = js.native
    var onClose: OnJSEv1[ReactEventFromHtml] = js.native
    var onOpen: OnJSEv1[ReactEventFromHtml] = js.native
    var open: js.UndefOr[Boolean] = js.native
    var renderValue: js.UndefOr[js.Function1[Value, ReactNode]] = js.native
    var value: js.UndefOr[Value] = js.native
  }

  private def props(
      autoWidth:    js.UndefOr[Boolean],
      classes:      js.Dictionary[String],
      displayEmpty: js.UndefOr[Boolean],
      input:        js.UndefOr[ReactNode],
      inputProps:   js.UndefOr[js.Object],
      MenuProps:    js.UndefOr[Menu.Props],
      multiple:     js.UndefOr[Boolean],
      native:       js.UndefOr[Boolean],
      onChange:     OnJSEv2[ReactEventFromHtml, ReactElement],
      onClose:      OnJSEv1[ReactEventFromHtml],
      onOpen:       OnJSEv1[ReactEventFromHtml],
      open:         js.UndefOr[Boolean],
      renderValue:  js.UndefOr[js.Function1[Value, ReactNode]],
      value:        js.UndefOr[Value],
      otherProps:   (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    autoWidth.foreach(p.updateDynamic("autoWidth")(_))
    displayEmpty.foreach(p.updateDynamic("displayEmpty")(_))
    input.foreach(p.updateDynamic("input")(_))
    inputProps.foreach(p.updateDynamic("inputProps")(_))
    MenuProps.foreach(p.updateDynamic("MenuProps")(_))
    multiple.foreach(p.updateDynamic("multiple")(_))
    native.foreach(p.updateDynamic("native")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    onClose.foreach(p.updateDynamic("onClose")(_))
    onOpen.foreach(p.updateDynamic("onOpen")(_))
    open.foreach(p.updateDynamic("open")(_))
    renderValue.foreach(p.updateDynamic("renderValue")(_))
    value.foreach(p.updateDynamic("value")(_))
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object select extends ClassKey("select")
  object selectMenu extends ClassKey("selectMenu")
  object disabled extends ClassKey("disabled")
  object icon extends ClassKey("icon")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      autoWidth:    js.UndefOr[Boolean]                        = js.undefined,
      classes:      Map[ClassKey, String]                      = Map.empty,
      displayEmpty: js.UndefOr[Boolean]                        = js.undefined,
      input:        js.UndefOr[ReactNode]                      = js.undefined,
      inputProps:   js.UndefOr[js.Object]                      = js.undefined,
      MenuProps:    js.UndefOr[Menu.Props]                     = js.undefined,
      multiple:     js.UndefOr[Boolean]                        = js.undefined,
      native:       js.UndefOr[Boolean]                        = js.undefined,
      onChange:     OnJSEv2[ReactEventFromHtml, ReactElement]  = js.undefined,
      onClose:      OnJSEv1[ReactEventFromHtml]                = js.undefined,
      onOpen:       OnJSEv1[ReactEventFromHtml]                = js.undefined,
      open:         js.UndefOr[Boolean]                        = js.undefined,
      renderValue:  js.UndefOr[js.Function1[Value, ReactNode]] = js.undefined,
      value:        js.UndefOr[Value]                          = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      autoWidth,
      classes,
      displayEmpty,
      input,
      inputProps,
      MenuProps,
      multiple,
      native,
      onChange,
      onClose,
      onOpen,
      open,
      renderValue,
      value,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
