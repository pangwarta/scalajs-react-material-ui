package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ListSubheader {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    color: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    disableSticky: js.UndefOr[Boolean] = js.undefined,
    inset: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      color,
      component,
      disableSticky,
      inset
    )
    this.component(p)(children: _*)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    color: js.UndefOr[String],
    component: js.UndefOr[String | ReactElement],
    disableSticky: js.UndefOr[Boolean],
    inset: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    component.foreach(p.updateDynamic("component")(_))
    disableSticky.foreach(p.updateDynamic("disableSticky")(_))
    inset.foreach(p.updateDynamic("inset")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String]               = js.native
    var className: js.UndefOr[String]                = js.native
    var color: js.UndefOr[String]                    = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var disableSticky: js.UndefOr[Boolean]           = js.native
    var inset: js.UndefOr[Boolean]                   = js.native
  }

  sealed abstract case class Color(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object default extends Color("default")

  object primary extends Color("primary")

  object inherit extends Color("inherit")

  object root extends ClassKey("root")

  object colorPrimary extends ClassKey("colorPrimary")

  object colorInherit extends ClassKey("colorInherit")

  object inset extends ClassKey("inset")

  object sticky extends ClassKey("sticky")

  @JSImport("@material-ui/core", "ListSubheader")
  @js.native
  private object RawComponent extends js.Object
}
