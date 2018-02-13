package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object InputAdornment {

  @JSImport("material-ui", "InputAdornment")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var disableTypography: js.UndefOr[Boolean] = js.native
    var position: js.UndefOr[String] = js.native
  }

  private def props(
      classes:           js.Dictionary[String],
      className:         js.UndefOr[String],
      component:         js.UndefOr[String | ReactElement],
      disableTypography: js.UndefOr[Boolean],
      position:          js.UndefOr[String],
      otherProps:        (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    disableTypography.foreach(p.updateDynamic("disableTypography")(_))
    position.foreach(p.updateDynamic("position")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  sealed abstract case class ClassKey(get: String) extends StringType

  def apply(
      classes:           Map[ClassKey, String]             = Map.empty,
      className:         js.UndefOr[String]                = js.undefined,
      component:         js.UndefOr[String | ReactElement] = js.undefined,
      disableTypography: js.UndefOr[Boolean]               = js.undefined,
      position:          js.UndefOr[String]                = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      component,
      disableTypography,
      position,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
