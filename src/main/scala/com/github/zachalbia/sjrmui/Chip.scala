package com.github.zachalbia.sjrmui

import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Chip {

  @JSImport("material-ui", "Chip")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var avatar: js.UndefOr[ReactElement] = js.native
    var className: js.UndefOr[String] = js.native
    var classes: js.Dictionary[String] = js.native
    var deleteIcon: js.UndefOr[ReactElement] = js.native
    var label: js.UndefOr[ReactElement] = js.native
    var onClick: OnJSEv1[ReactMouseEvent] = js.native
    var onKeyDown: OnJSEv1[ReactKeyboardEvent] = js.native
    var onRequestDelete: OnJSEv1[ReactEvent] = js.native
    var tabIndex: js.UndefOr[Int | String] = js.native
  }

  private def props(
      avatar:          js.UndefOr[ReactElement],
      className:       js.UndefOr[String],
      classes:         js.Dictionary[String],
      deleteIcon:      js.UndefOr[ReactElement],
      label:           js.UndefOr[ReactElement],
      onClick:         OnJSEv1[ReactMouseEvent],
      onKeyDown:       OnJSEv1[ReactKeyboardEvent],
      onRequestDelete: OnJSEv1[ReactEvent],
      tabIndex:        js.UndefOr[Int | String],
      otherProps:      (String, js.Any)*): Props = {
    val p = js.Dynamic.literal(
      avatar          = avatar,
      className       = className,
      classes         = classes,
      deleteIcon      = deleteIcon,
      label           = label,
      onClick         = onClick,
      onKeyDown       = onKeyDown,
      onRequestDelete = onRequestDelete,
      tabIndex        = tabIndex)
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object clickable extends ClassKey("clickable")
  object deletable extends ClassKey("deletable")
  object avatar extends ClassKey("avatar")
  object avatarChildren extends ClassKey("avatarChildren")
  object label extends ClassKey("label")
  object deleteIcon extends ClassKey("deleteIcon")

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
      avatar:          js.UndefOr[Avatar.Type]           = js.undefined,
      className:       js.UndefOr[String]                = js.undefined,
      classes:         Map[String, String]               = Map.empty,
      deleteIcon:      js.UndefOr[ReactElement]          = js.undefined,
      label:           js.UndefOr[ReactElement]          = js.undefined,
      onClick:         ReactHandler1[ReactMouseEvent]    = js.undefined,
      onKeyDown:       ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onRequestDelete: ReactHandler1[ReactEvent]         = js.undefined,
      tabIndex:        js.UndefOr[Int | String]          = js.undefined)(otherProps: (String, js.Any)*) = {
    val p = props(
      avatar,
      className,
      classes,
      deleteIcon,
      label,
      onClick,
      onKeyDown,
      onRequestDelete,
      tabIndex,
      otherProps: _*)
    component(p)
  }
}
