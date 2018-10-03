package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent, ReactKeyboardEventFromHtml}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object RadioGroup {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    name: js.UndefOr[String] = js.undefined,
    onBlur: ReactHandler1[ReactEvent] = js.undefined,
    onChange: ReactHandler2[ReactEvent, String] = js.undefined,
    onKeyDown: ReactHandler1[ReactKeyboardEventFromHtml] = js.undefined,
    value: js.UndefOr[String] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      name,
      onBlur,
      onChange,
      onKeyDown,
      value,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    name: js.UndefOr[String],
    onBlur: OnJSEv1[ReactEvent],
    onChange: OnJSEv2[ReactEvent, String],
    onKeyDown: OnJSEv1[ReactKeyboardEventFromHtml],
    value: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    name.foreach(p.updateDynamic("name")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onChange.foreach(p.updateDynamic("onChange")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var name: js.UndefOr[String]                       = js.native
    var onBlur: OnJSEv1[ReactEvent]                    = js.native
    var onChange: OnJSEv2[ReactEvent, String]          = js.native
    var onKeyDown: OnJSEv1[ReactKeyboardEventFromHtml] = js.native
    var value: js.UndefOr[String]                      = js.native
  }

  @JSImport("@material-ui/core", "RadioGroup")
  @js.native
  private object RawComponent extends js.Object
}
