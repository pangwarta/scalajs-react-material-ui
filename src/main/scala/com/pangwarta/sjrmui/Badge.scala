package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Badge {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    badgeContent: js.UndefOr[String | ReactElement] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    color: js.UndefOr[Color] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      badgeContent,
      classes,
      className,
      color,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    badgeContent: js.UndefOr[String | ReactElement],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    color: js.UndefOr[String],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    badgeContent.foreach(v => p.updateDynamic("badgeContent")(v))
    className.foreach(v => p.updateDynamic("className")(v))
    color.foreach(v => p.updateDynamic("color")(v))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var badgeContent: js.UndefOr[String | ReactElement] = js.native
    var classes: js.Dictionary[String]                  = js.native
    var className: js.UndefOr[String]                   = js.native
    var color: js.UndefOr[String]                       = js.native
  }

  sealed abstract case class Color(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object Color {
    object default extends Color("default")
    object primary extends Color("primary")
    object accent  extends Color("accent")
  }

  object root                                      extends ClassKey("root")

  object badge                                     extends ClassKey("badge")

  object colorPrimary                              extends ClassKey("colorPrimary")

  object colorAccent                               extends ClassKey("colorAccent")

  @JSImport("@material-ui/core", "Badge")
  @js.native
  private object RawComponent extends js.Object
}
