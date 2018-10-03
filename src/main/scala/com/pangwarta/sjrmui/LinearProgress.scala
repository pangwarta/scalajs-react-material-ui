package com.pangwarta.sjrmui

import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object LinearProgress {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    color: js.UndefOr[Color] = js.undefined,
    mode: js.UndefOr[Mode] = js.undefined,
    value: js.UndefOr[Int] = js.undefined,
    valueBuffer: js.UndefOr[Int] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      classes,
      className,
      color,
      mode,
      value,
      valueBuffer,
      otherProps: _*
    )
    this.component(p)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    color: js.UndefOr[String],
    mode: js.UndefOr[String],
    value: js.UndefOr[Int],
    valueBuffer: js.UndefOr[Int],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    mode.foreach(p.updateDynamic("mode")(_))
    value.foreach(p.updateDynamic("value")(_))
    valueBuffer.foreach(p.updateDynamic("valueBuffer")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
    var color: js.UndefOr[String]      = js.native
    var mode: js.UndefOr[String]       = js.native
    var value: js.UndefOr[Int]         = js.native
    var valueBuffer: js.UndefOr[Int]   = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  sealed abstract case class Color(get: String) extends StringType

  sealed abstract case class Mode(get: String) extends StringType

  object ClassKey {
    object root              extends ClassKey("root")
    object primaryColor      extends ClassKey("primaryColor")
    object primaryColorBar   extends ClassKey("primaryColorBar")
    object primaryDashed     extends ClassKey("primaryDashed")
    object secondaryColor    extends ClassKey("secondaryColor")
    object secondaryColorBar extends ClassKey("secondaryColorBar")
    object secondaryDashed   extends ClassKey("secondaryDashed")
    object bar               extends ClassKey("bar")
    object dashed            extends ClassKey("dashed")
    object bufferBar2        extends ClassKey("bufferBar2")
    object rootBuffer        extends ClassKey("rootBuffer")
    object rootQuery         extends ClassKey("rootQuery")
    object indeterminateBar1 extends ClassKey("indeterminateBar1")
    object indeterminateBar2 extends ClassKey("indeterminateBar2")
    object determinateBar1   extends ClassKey("determinateBar1")
    object bufferBar1        extends ClassKey("bufferBar1")
  }

  object Color {
    object primary   extends Color("primary")
    object secondary extends Color("secondary")
  }

  object Mode {
    object determinate   extends Mode("determinate")
    object indeterminate extends Mode("indeterminate")
    object buffer        extends Mode("buffer")
    object query         extends Mode("query")
  }

  @JSImport("@material-ui/core", "LinearProgress")
  @js.native
  private object RawComponent extends js.Object
}
