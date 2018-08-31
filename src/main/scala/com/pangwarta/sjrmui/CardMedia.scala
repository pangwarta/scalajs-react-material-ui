package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object CardMedia {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    image: js.UndefOr[String] = js.undefined,
    src: js.UndefOr[String] = js.undefined,
    style: Map[String, String] = Map.empty
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      image,
      src,
      style,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    component: js.UndefOr[String | ReactElement],
    image: js.UndefOr[String],
    src: js.UndefOr[String],
    style: js.Dictionary[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes = classes,
      style = style
    )
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    image.foreach(p.updateDynamic("image")(_))
    src.foreach(p.updateDynamic("src")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String]   = js.native
    var className: js.UndefOr[String]    = js.native
    var component: String | ReactElement = js.native
    var image: js.UndefOr[String]        = js.native
    var src: js.UndefOr[String]          = js.native
    var style: js.Dictionary[String]     = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root                                      extends ClassKey("root")

  object rootMedia                                 extends ClassKey("rootMedia")

  @JSImport("@material-ui/core", "CardMedia")
  @js.native
  private object RawComponent extends js.Object
}
