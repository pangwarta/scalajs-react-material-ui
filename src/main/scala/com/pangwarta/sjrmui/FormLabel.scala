package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormLabel {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    focused: js.UndefOr[Boolean] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      disabled,
      error,
      focused,
      required,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    component: js.UndefOr[String | ReactElement],
    disabled: js.UndefOr[Boolean],
    error: js.UndefOr[Boolean],
    focused: js.UndefOr[Boolean],
    required: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    error.foreach(p.updateDynamic("error")(_))
    focused.foreach(p.updateDynamic("focused")(_))
    required.foreach(p.updateDynamic("required")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String]               = js.native
    var className: js.UndefOr[String]                = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var disabled: js.UndefOr[Boolean]                = js.native
    var error: js.UndefOr[Boolean]                   = js.native
    var focused: js.UndefOr[Boolean]                 = js.native
    var required: js.UndefOr[Boolean]                = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  @JSImport("@material-ui/core", "FormLabel")
  @js.native
  private object RawComponent extends js.Object
}
