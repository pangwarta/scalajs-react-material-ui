package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object CardHeader {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    action: js.UndefOr[ReactElement] = js.undefined,
    avatar: js.UndefOr[ReactElement] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    subheader: js.UndefOr[ReactElement] = js.undefined,
    title: js.UndefOr[ReactElement] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      action,
      avatar,
      classes,
      subheader,
      title,
      otherProps: _*
    )
    component(p)(children: _*)
  }

  private def props(
    action: js.UndefOr[ReactElement],
    avatar: js.UndefOr[ReactElement],
    classes: js.Dictionary[String],
    subheader: js.UndefOr[ReactElement],
    title: js.UndefOr[ReactElement],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    action.foreach(p.updateDynamic("action")(_))
    avatar.foreach(p.updateDynamic("avatar")(_))
    subheader.foreach(p.updateDynamic("subheader")(_))
    title.foreach(p.updateDynamic("title")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends CardContent.Props {
    var action: js.UndefOr[ReactElement]    = js.native
    var avatar: js.UndefOr[ReactElement]    = js.native
    var classes: js.Dictionary[String]      = js.native
    var subheader: js.UndefOr[ReactElement] = js.native
    var title: js.UndefOr[ReactElement]     = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object root                                      extends ClassKey("root")

  object avatar                                    extends ClassKey("avatar")

  object action                                    extends ClassKey("action")

  object content                                   extends ClassKey("content")

  object title                                     extends ClassKey("title")

  object subheader                                 extends ClassKey("subheader")

  @JSImport("@material-ui/core", "CardHeader")
  @js.native
  private object RawComponent extends js.Object
}
