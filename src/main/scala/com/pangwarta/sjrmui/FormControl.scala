package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormControl {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    error: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    margin: js.UndefOr[Margin] = js.undefined,
    onBlur: OnJSEv1[ReactEvent] = js.undefined,
    onFocus: OnJSEv1[ReactEvent] = js.undefined,
    required: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      disabled,
      error,
      fullWidth,
      margin,
      onBlur,
      onFocus,
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
    fullWidth: js.UndefOr[Boolean],
    margin: js.UndefOr[String],
    onBlur: OnJSEv1[ReactEvent],
    onFocus: OnJSEv1[ReactEvent],
    required: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    error.foreach(p.updateDynamic("error")(_))
    fullWidth.foreach(p.updateDynamic("fullWidth")(_))
    margin.foreach(p.updateDynamic("margin")(_))
    onBlur.foreach(p.updateDynamic("onBlur")(_))
    onFocus.foreach(p.updateDynamic("onFocus")(_))
    required.foreach(p.updateDynamic("required")(_))
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String]               = js.native
    var className: js.UndefOr[String]                = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var disabled: js.UndefOr[Boolean]                = js.native
    var error: js.UndefOr[Boolean]                   = js.native
    var fullWidth: js.UndefOr[Boolean]               = js.native
    var margin: js.UndefOr[String]                   = js.native
    var onBlur: OnJSEv1[ReactEvent]                  = js.native
    var onFocus: OnJSEv1[ReactEvent]                 = js.native
    var required: js.UndefOr[Boolean]                = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  sealed abstract case class Margin(get: String) extends StringType

  object ClassKey {
    object root         extends ClassKey("root")
    object marginNormal extends ClassKey("marginNormal")
    object marginDense  extends ClassKey("marginDense")
    object fullWidth    extends ClassKey("fullWidth")
  }

  object Margin {
    object none   extends Margin("none")
    object dense  extends Margin("dense")
    object normal extends Margin("normal")
  }

  @JSImport("@material-ui/core", "FormControl")
  @js.native
  private object RawComponent extends js.Object
}
