package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object SvgIcon {

  @JSImport("material-ui", "SvgIcon")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var color: js.UndefOr[String] = js.native
    var fontSize: js.UndefOr[Boolean] = js.native
    var nativeColor: js.UndefOr[String] = js.native
    var titleAccess: js.UndefOr[String] = js.native
    var viewBox: js.UndefOr[String] = js.native
  }

  sealed abstract case class Color(get: String) extends StringType
  object Color {
    object action extends Color("action")
    object disabled extends Color("disabled")
    object error extends Color("error")
    object inherit extends Color("inherit")
    object primary extends Color("primary")
    object secondary extends Color("secondary")
  }

  private def props(
      classes:     js.Dictionary[String],
      className:   js.UndefOr[String],
      color:       js.UndefOr[String],
      fontSize:    js.UndefOr[Boolean],
      nativeColor: js.UndefOr[String],
      titleAccess: js.UndefOr[String],
      viewBox:     js.UndefOr[String],
      otherProps:  (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    color.foreach(p.updateDynamic("color")(_))
    fontSize.foreach(p.updateDynamic("fontSize")(_))
    nativeColor.foreach(p.updateDynamic("nativeColor")(_))
    titleAccess.foreach(p.updateDynamic("titleAccess")(_))
    viewBox.foreach(p.updateDynamic("viewBox")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root extends ClassKey("root")
    object colorSecondary extends ClassKey("colorSecondary")
    object colorAction extends ClassKey("colorAction")
    object colorDisabled extends ClassKey("colorDisabled")
    object colorError extends ClassKey("colorError")
    object colorPrimary extends ClassKey("colorPrimary")
    object fontSize extends ClassKey("fontSize")
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
      classes:     Map[ClassKey, String] = Map.empty,
      className:   js.UndefOr[String]    = js.undefined,
      color:       js.UndefOr[Color]     = js.undefined,
      fontSize:    js.UndefOr[Boolean]   = js.undefined,
      nativeColor: js.UndefOr[String]    = js.undefined,
      titleAccess: js.UndefOr[String]    = js.undefined,
      viewBox:     js.UndefOr[String]    = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      color,
      fontSize,
      nativeColor,
      titleAccess,
      viewBox,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
