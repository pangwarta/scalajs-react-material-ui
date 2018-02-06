package com.pangwarta.sjrmui

import japgolly.scalajs.react._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object CircularProgress {

  @JSImport("material-ui", "CircularProgress")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var color: js.UndefOr[String] = js.native
    var max: js.UndefOr[Int] = js.native
    var min: js.UndefOr[Int] = js.native
    var mode: js.UndefOr[String] = js.native
    var size: js.UndefOr[Double | String] = js.native
    var thickness: js.UndefOr[Double] = js.native
    var value: js.UndefOr[Double] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      color:      js.UndefOr[String],
      max:        js.UndefOr[Int],
      min:        js.UndefOr[Int],
      mode:       js.UndefOr[String],
      size:       js.UndefOr[Double | String],
      thickness:  js.UndefOr[Double],
      value:      js.UndefOr[Double],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    max.foreach(p.updateDynamic("max")(_))
    min.foreach(p.updateDynamic("min")(_))
    mode.foreach(p.updateDynamic("mode")(_))
    size.foreach(p.updateDynamic("size")(_))
    thickness.foreach(p.updateDynamic("thickness")(_))
    value.foreach(p.updateDynamic("value")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  abstract sealed case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object colorPrimary extends ClassKey("colorPrimary")
    object colorSecondary extends ClassKey("colorSecondary")
    object svg extends ClassKey("svg")
    object indeterminateSvg extends ClassKey("indeterminateSvg")
    object circle extends ClassKey("circle")
    object indeterminateCircle extends ClassKey("indeterminateCircle")
    object determinateCircle extends ClassKey("determinateCircle")
  }

  abstract sealed case class Color(get: String) extends StringType
  object Color {
    object primary extends Color("primary")
    object secondary extends Color("secondary")
    object inherit extends Color("inherit")
  }

  abstract sealed case class Mode(get: String) extends StringType
  object Mode {
    object determinate extends Mode("determinate")
    object indeterminate extends Mode("indeterminate")
  }

  def apply(
      classes:   Map[ClassKey, String]       = Map.empty,
      className: js.UndefOr[String]          = js.undefined,
      color:     js.UndefOr[Color]           = js.undefined,
      max:       js.UndefOr[Int]             = js.undefined,
      min:       js.UndefOr[Int]             = js.undefined,
      mode:      js.UndefOr[Mode]            = js.undefined,
      size:      js.UndefOr[Double | String] = js.undefined,
      thickness: js.UndefOr[Double]          = js.undefined,
      value:     js.UndefOr[Double]          = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      classes,
      className,
      color,
      max,
      min,
      mode,
      size,
      thickness,
      value,
      otherProps: _*
    )
    component(p)
  }
}
