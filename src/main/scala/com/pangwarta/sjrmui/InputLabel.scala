package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object InputLabel {

  @JSImport("material-ui", "InputLabel")
  @js.native
  private object RawComponent extends js.Object

  val dense = "dense"

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var disableAnimation: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var error: js.UndefOr[Boolean] = js.native
    var focused: js.UndefOr[Boolean] = js.native
    var FormControlClasses: js.Dictionary[String] = js.native
    var margin: js.UndefOr[dense.type] = js.native
    var required: js.UndefOr[Boolean] = js.native
    var shrink: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:            js.Dictionary[String],
      className:          js.UndefOr[String],
      disableAnimation:   js.UndefOr[Boolean],
      disabled:           js.UndefOr[Boolean],
      error:              js.UndefOr[Boolean],
      focused:            js.UndefOr[Boolean],
      FormControlClasses: js.Dictionary[String],
      margin:             js.UndefOr[dense.type],
      required:           js.UndefOr[Boolean],
      shrink:             js.UndefOr[Boolean],
      otherProps:         (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes            = classes,
      FormControlClasses = FormControlClasses
    )
    className.foreach(p.updateDynamic("className")(_))
    disableAnimation.foreach(p.updateDynamic("disableAnimation")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    error.foreach(p.updateDynamic("error")(_))
    focused.foreach(p.updateDynamic("focused")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  sealed abstract case class ClassKey(get: String) extends StringType
  object formControl extends ClassKey("formControl")
  object labelDense extends ClassKey("labelDense")
  object shrink extends ClassKey("shrink")
  object animated extends ClassKey("animated")

  def apply(
      classes:            Map[ClassKey, String]             = Map.empty,
      className:          js.UndefOr[String]                = js.undefined,
      disableAnimation:   js.UndefOr[Boolean]               = js.undefined,
      disabled:           js.UndefOr[Boolean]               = js.undefined,
      error:              js.UndefOr[Boolean]               = js.undefined,
      focused:            js.UndefOr[Boolean]               = js.undefined,
      FormControlClasses: Map[FormControl.ClassKey, String] = Map.empty,
      margin:             js.UndefOr[dense.type]            = js.undefined,
      required:           js.UndefOr[Boolean]               = js.undefined,
      shrink:             js.UndefOr[Boolean]               = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableAnimation,
      disabled,
      error,
      focused,
      FormControlClasses,
      margin,
      required,
      shrink,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
