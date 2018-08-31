package com.pangwarta.sjrmui

import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Divider {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
    absolute: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined,
    light: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      absolute,
      classes,
      className,
      inset,
      light,
      otherProps: _*
    )
    component(p)
  }

  private def props(
    absolute: js.UndefOr[Boolean],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    inset: js.UndefOr[Boolean],
    light: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    absolute.foreach(v => p.updateDynamic("absolute")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    inset.foreach(v => p.updateDynamic("inset")(v))
    light.foreach(v => p.updateDynamic("light")(v))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var absolute: js.UndefOr[Boolean]  = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
    var inset: js.UndefOr[Boolean]     = js.native
    var light: js.UndefOr[Boolean]     = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root                                      extends ClassKey("root")

  object default                                   extends ClassKey("default")

  object inset                                     extends ClassKey("inset")

  object light                                     extends ClassKey("light")

  object absolute                                  extends ClassKey("absolute")

  @JSImport("@material-ui/core", "Divider")
  @js.native
  private object RawComponent extends js.Object
}
