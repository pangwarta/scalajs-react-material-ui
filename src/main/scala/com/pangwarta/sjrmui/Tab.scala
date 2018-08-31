package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Element => ReactElement}
import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent, ReactEvent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Tab {

  def apply[A](
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    icon: js.UndefOr[String | ReactElement] = js.undefined,
    indicator: js.UndefOr[String | ReactElement] = js.undefined,
    label: js.UndefOr[String | ReactElement] = js.undefined,
    onChange: OnJSEv1[ReactEvent] = js.undefined,
    onClick: OnJSEv1[ReactEvent] = js.undefined,
    selected: js.UndefOr[Boolean] = js.undefined,
    style: js.UndefOr[js.Object] = js.undefined,
    value: js.UndefOr[A] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disabled,
      fullWidth,
      icon,
      indicator,
      label,
      onChange,
      onClick,
      selected,
      style,
      value,
      otherProps: _*
    )
    component[A](p)(children: _*)
  }

  private def props[A](
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    disabled: js.UndefOr[Boolean],
    fullWidth: js.UndefOr[Boolean],
    icon: js.UndefOr[String | ReactElement],
    indicator: js.UndefOr[String | ReactElement],
    label: js.UndefOr[String | ReactElement],
    onChange: OnJSEv1[ReactEvent],
    onClick: OnJSEv1[ReactEvent],
    selected: js.UndefOr[Boolean],
    style: js.UndefOr[js.Object],
    value: js.UndefOr[A],
    otherProps: (String, js.Any)*
  ): Props[A] = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(v => p.updateDynamic("className")(v))
    disabled.foreach(v => p.updateDynamic("disabled")(v))
    fullWidth.foreach(v => p.updateDynamic("fullWidth")(v))
    icon.foreach(v => p.updateDynamic("icon")(v))
    indicator.foreach(v => p.updateDynamic("indicator")(v))
    label.foreach(v => p.updateDynamic("label")(v))
    onChange.foreach(v => p.updateDynamic("onChange")(v))
    onClick.foreach(v => p.updateDynamic("onClick")(v))
    selected.foreach(v => p.updateDynamic("selected")(v))
    style.foreach(v => p.updateDynamic("style")(v))
    value.foreach(v => p.updateDynamic("value")(v.asInstanceOf[js.Any]))

    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props[A]]
  }

  private def component[A] = JsComponent[Props[A], Children.Varargs, Null](RawComponent)

  @js.native
  private[sjrmui] trait Props[A] extends js.Object {
    var classes: js.Dictionary[String]               = js.native
    var className: js.UndefOr[String]                = js.native
    var disabled: js.UndefOr[Boolean]                = js.native
    var fullWidth: js.UndefOr[Boolean]               = js.native
    var icon: js.UndefOr[String | ReactElement]      = js.native
    var indicator: js.UndefOr[String | ReactElement] = js.native
    var label: js.UndefOr[String | ReactElement]     = js.native
    var onChange: OnJSEv1[ReactEvent]                = js.native
    var onClick: OnJSEv1[ReactEvent]                 = js.native
    var selected: js.UndefOr[Boolean]                = js.native
    var style: js.UndefOr[js.Object]                 = js.native
    var value: js.UndefOr[A]                         = js.native
  }

  sealed abstract case class TextColor(get: String) extends StringType

  sealed abstract case class ClassKey(get: String) extends StringType

  object TextColor {
    object secondary extends TextColor("secondary")
    object primary   extends TextColor("primary")
    object inherit   extends TextColor("inherit")
  }

  object root extends ClassKey("root")

  object rootLabelIcon extends ClassKey("rootLabelIcon")

  object rootInherit extends ClassKey("rootInherit")

  object rootPrimary extends ClassKey("rootPrimary")

  object rootPrimarySelected extends ClassKey("rootPrimarySelected")

  object rootPrimaryDisabled extends ClassKey("rootPrimaryDisabled")

  object rootSecondary extends ClassKey("rootSecondary")

  object rootSecondarySelected extends ClassKey("rootSecondarySelected")

  object rootSecondaryDisabled extends ClassKey("rootSecondaryDisabled")

  object rootInheritSelected extends ClassKey("rootInheritSelected")

  object rootInheritDisabled extends ClassKey("rootInheritDisabled")

  object fullWidth extends ClassKey("fullWidth")

  object wrapper extends ClassKey("wrapper")

  object labelContainer extends ClassKey("labelContainer")

  object label extends ClassKey("label")

  object labelWrapped extends ClassKey("labelWrapped")

  @JSImport("@material-ui/core", "Tab")
  @js.native
  private object RawComponent extends js.Object
}
