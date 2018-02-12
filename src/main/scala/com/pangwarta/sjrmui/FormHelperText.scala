package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object FormHelperText {

  @JSImport("material-ui", "FormHelperText")
  @js.native
  private object RawComponent extends js.Object

  val dense = "dense"

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var margin: js.UndefOr[dense.type] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      component:  js.UndefOr[String | ReactElement],
      disabled:   js.UndefOr[Boolean],
      error:      js.UndefOr[Boolean],
      margin:     js.UndefOr[dense.type],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    error.foreach(p.updateDynamic("error")(_))
    margin.foreach(m => p.updateDynamic("margin")(m.asInstanceOf[js.Any]))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object dense extends ClassKey("dense")
    object error extends ClassKey("error")
    object disabled extends ClassKey("disabled")
  }

  def apply(
      classes:   Map[ClassKey, String]             = Map.empty,
      className: js.UndefOr[String]                = js.undefined,
      component: js.UndefOr[String | ReactElement] = js.undefined,
      disabled:  js.UndefOr[Boolean]               = js.undefined,
      error:     js.UndefOr[Boolean]               = js.undefined,
      margin:    js.UndefOr[dense.type]            = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      disabled,
      error,
      margin,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
