package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object CardMedia {

  @JSImport("material-ui", "CardMedia")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: String | ReactElement = js.native
    var image: js.UndefOr[String] = js.native
    var src: js.UndefOr[String] = js.native
  }

  private def props(
      classes:    js.Dictionary[String],
      className:  js.UndefOr[String],
      component:  String | ReactElement,
      image:      js.UndefOr[String],
      src:        js.UndefOr[String],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes   = classes,
      className = className,
      component = component,
      image     = image,
      src       = src
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object rootMedia extends ClassKey("rootMedia")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement,
      image:     js.UndefOr[String]    = js.undefined,
      src:       js.UndefOr[String]    = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      image,
      src,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
