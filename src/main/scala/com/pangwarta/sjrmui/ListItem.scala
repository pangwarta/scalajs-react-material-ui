package com.pangwarta.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object ListItem {

  @JSImport("material-ui", "ListItem")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var button: js.UndefOr[Boolean] = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String] = js.native
    var component: js.UndefOr[String | ReactElement] = js.native
    var dense: js.UndefOr[Boolean] = js.native
    var disabled: js.UndefOr[Boolean] = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
    var divider: js.UndefOr[Boolean] = js.native
  }

  private def props(
      button:         js.UndefOr[Boolean],
      classes:        js.Dictionary[String],
      className:      js.UndefOr[String],
      component:      js.UndefOr[String | ReactElement],
      dense:          js.UndefOr[Boolean],
      disabled:       js.UndefOr[Boolean],
      disableGutters: js.UndefOr[Boolean],
      divider:        js.UndefOr[Boolean],
      otherProps:     (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    button.foreach(p.updateDynamic("button")(_))
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    dense.foreach(p.updateDynamic("dense")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableGutters.foreach(p.updateDynamic("disableGutters")(_))
    divider.foreach(p.updateDynamic("divider")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  sealed abstract case class ClassKey(get: String) extends StringType
  object button extends ClassKey("button")
  object container extends ClassKey("container")
  object default extends ClassKey("default")
  object dense extends ClassKey("dense")
  object disabled extends ClassKey("disabled")
  object divider extends ClassKey("divider")
  object gutters extends ClassKey("gutters")
  object keyboardFocused extends ClassKey("keyboardFocused")
  object root extends ClassKey("root")
  object secondaryAction extends ClassKey("secondaryAction")

  def apply(
      button:         js.UndefOr[Boolean]               = js.undefined,
      classes:        Map[ClassKey, String]             = Map.empty,
      className:      js.UndefOr[String]                = js.undefined,
      component:      js.UndefOr[String | ReactElement] = js.undefined,
      dense:          js.UndefOr[Boolean]               = js.undefined,
      disabled:       js.UndefOr[Boolean]               = js.undefined,
      disableGutters: js.UndefOr[Boolean]               = js.undefined,
      divider:        js.UndefOr[Boolean]               = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      button,
      classes,
      className,
      component,
      dense,
      disabled,
      disableGutters,
      divider,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }
}
