package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Avatar {

  @JSImport("material-ui", "Avatar")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var alt: js.UndefOr[String] = js.native
    var childrenClassName: js.UndefOr[String] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: String | ReactElement = js.native
    var imgProps: js.Dictionary[String] = js.native
    var sizes: js.UndefOr[String] = js.native
    var src: js.UndefOr[String] = js.native
    var srcSet: js.UndefOr[String] = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object colorDefault extends ClassKey("colorDefault")
  object img extends ClassKey("img")

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      alt:       js.UndefOr[String]    = js.undefined,
      classes:   Map[ClassKey, String] = Map.empty,
      className: js.UndefOr[String]    = js.undefined,
      component: String | ReactElement = "div",
      imgProps:  Map[String, String]   = Map.empty,
      sizes:     js.UndefOr[String]    = js.undefined,
      src:       js.UndefOr[String]    = js.undefined,
      srcSet:    js.UndefOr[String]    = js.undefined)(children: VdomNode*) = {
    val p = (new js.Object).asInstanceOf[Props]
    p.alt = alt
    p.classes = classes
    p.className = className
    p.component = component
    p.imgProps = imgProps
    p.sizes = sizes
    p.src = src
    p.srcSet = srcSet
    this.component(p)(children: _*)
  }
}
