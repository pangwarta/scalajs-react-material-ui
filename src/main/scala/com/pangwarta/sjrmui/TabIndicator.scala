package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TabIndicator {

  @JSImport("material-ui", "TabIndicator")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class TextColor(get: String) extends StringType
  object TextColor {
    object primary extends TextColor("primary")
    object secondary extends TextColor("secondary")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var style: js.UndefOr[js.Object] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      style:      js.UndefOr[js.Object],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    style.foreach(p.updateDynamic("component")(_))
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      style:     js.UndefOr[js.Object] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      style,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
