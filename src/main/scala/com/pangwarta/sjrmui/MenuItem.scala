package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MenuItem {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    button: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    component: js.UndefOr[String | ReactElement] = js.undefined,
    dense: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined,
    divider: js.UndefOr[Boolean] = js.undefined,
    role: js.UndefOr[String] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined
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
      role,
      selected,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    button: js.UndefOr[Boolean],
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    component: js.UndefOr[String | ReactElement],
    dense: js.UndefOr[Boolean],
    disabled: js.UndefOr[Boolean],
    disableGutters: js.UndefOr[Boolean],
    divider: js.UndefOr[Boolean],
    role: js.UndefOr[String],
    selected: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    button.foreach(p.updateDynamic("button")(_))
    className.foreach(p.updateDynamic("className")(_))
    component.foreach(p.updateDynamic("component")(_))
    dense.foreach(p.updateDynamic("dense")(_))
    disabled.foreach(p.updateDynamic("disabled")(_))
    disableGutters.foreach(p.updateDynamic("disableGutters")(_))
    divider.foreach(p.updateDynamic("divider")(_))
    role.foreach(p.updateDynamic("role")(_))
    selected.foreach(p.updateDynamic("selected")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends ListItem.Props {
    var role: js.UndefOr[String]      = js.native
    var selected: js.UndefOr[Boolean] = js.native
  }

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

  @JSImport("@material-ui/core", "MenuItem")
  @js.native
  private object RawComponent extends js.Object
}
