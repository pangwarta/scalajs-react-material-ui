package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Js.{ RawMounted, UnmountedWithRawType }
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Avatar {

  type Type = UnmountedWithRawType[Avatar.Props, Null, RawMounted]

  @JSImport("material-ui", "Avatar")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var alt: js.UndefOr[String] = js.native
    var childrenClassName: js.UndefOr[String] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var imgProps: js.Dictionary[String] = js.native
    var sizes: js.UndefOr[String] = js.native
    var src: js.UndefOr[String] = js.native
    var srcSet: js.UndefOr[String] = js.native
  }

  private def props(
      alt:               js.UndefOr[String],
      childrenClassName: js.UndefOr[String],
      classes:           js.Dictionary[String],
      className:         js.UndefOr[String],
      component:         js.UndefOr[String | ReactElement],
      imgProps:          js.Dictionary[String],
      sizes:             js.UndefOr[String],
      src:               js.UndefOr[String],
      srcSet:            js.UndefOr[String],
      otherProps:        (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes  = classes,
      imgProps = imgProps
    )
    alt.foreach(v => p.updateDynamic("alt")(v))
    childrenClassName.foreach(v => p.updateDynamic("childrenClassName")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    component.foreach(v => p.updateDynamic("component")(v))
    sizes.foreach(v => p.updateDynamic("sizes")(v))
    src.foreach(v => p.updateDynamic("src")(v))
    srcSet.foreach(v => p.updateDynamic("srcSet")(v))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object colorDefault extends ClassKey("colorDefault")
  object img extends ClassKey("img")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      alt:               js.UndefOr[String]                = js.undefined,
      childrenClassName: js.UndefOr[String]                = js.undefined,
      classes:           Map[ClassKey, String]             = Map.empty,
      className:         js.UndefOr[String]                = js.undefined,
      component:         js.UndefOr[String | ReactElement] = "div",
      imgProps:          Map[String, String]               = Map.empty,
      sizes:             js.UndefOr[String]                = js.undefined,
      src:               js.UndefOr[String]                = js.undefined,
      srcSet:            js.UndefOr[String]                = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*): Avatar.Type = {
    val p = props(
      alt,
      childrenClassName,
      classes,
      className,
      component,
      imgProps,
      sizes,
      src,
      srcSet,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
