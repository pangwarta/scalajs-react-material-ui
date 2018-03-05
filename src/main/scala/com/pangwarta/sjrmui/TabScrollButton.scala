package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object TabScrollButton {

  @JSImport("material-ui", "TabScrollButton")
  @js.native
  private object RawComponent extends js.Object

  sealed abstract case class Direction(get: String) extends StringType
  object Direction {
    object primary extends Direction("left")
    object secondary extends Direction("right")
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var onClick: OnJSEv1[ReactEvent] = js.native
    var visible: js.UndefOr[Boolean] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      onClick:    OnJSEv1[ReactEvent],
      visible:    js.UndefOr[Boolean],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    onClick.foreach(p.updateDynamic("onClick")(_))
    visible.foreach(p.updateDynamic("visible")(_))
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      onClick:   OnJSEv1[ReactEvent]   = js.undefined,
      visible:   js.UndefOr[Boolean]   = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      onClick,
      visible,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}

