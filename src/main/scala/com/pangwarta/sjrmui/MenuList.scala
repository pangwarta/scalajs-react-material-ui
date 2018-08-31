package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEventFromHtml, ReactKeyboardEventFromHtml}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MenuList {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    className: js.UndefOr[String] = js.undefined,
    onBlur: ReactHandler1[ReactEventFromHtml] = js.undefined,
    onKeyDown: ReactHandler1[ReactKeyboardEventFromHtml] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      className,
      onBlur,
      onKeyDown,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    className: js.UndefOr[String],
    onBlur: OnJSEv1[ReactEventFromHtml],
    onKeyDown: OnJSEv1[ReactKeyboardEventFromHtml],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal()
    className.foreach(p.updateDynamic("className")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  trait Props extends js.Object {
    var className: js.UndefOr[String]                  = js.native
    var onBlur: OnJSEv1[ReactEventFromHtml]            = js.native
    var onKeyDown: OnJSEv1[ReactKeyboardEventFromHtml] = js.native
  }

  @JSImport("@material-ui/core", "MenuList")
  @js.native
  object RawComponent extends js.Object
}
