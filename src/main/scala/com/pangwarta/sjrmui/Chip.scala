package com.pangwarta.sjrmui

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
      avatar:     js.UndefOr[ReactElement],
      className:  js.UndefOr[String],
      classes:    js.Dictionary[String],
      deleteIcon: js.UndefOr[ReactElement],
      label:      js.UndefOr[ReactElement],
      onClick:    OnJSEv1[ReactMouseEvent],
      onKeyDown:  OnJSEv1[ReactKeyboardEvent],
      onDelete:   OnJSEv1[ReactEvent],
      tabIndex:   js.UndefOr[Int | String],
      otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    avatar.foreach(p.updateDynamic("avatar")(_))
    className.foreach(p.updateDynamic("className")(_))
    deleteIcon.foreach(p.updateDynamic("deleteIcon")(_))
    label.foreach(p.updateDynamic("label")(_))
    onClick.foreach(p.updateDynamic("onClick")(_))
    onKeyDown.foreach(p.updateDynamic("onKeyDown")(_))
    onDelete.foreach(p.updateDynamic("onDelete")(_))
    tabIndex.foreach(p.updateDynamic("tabIndex")(_))
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
      avatar:     js.UndefOr[Avatar.Type]           = js.undefined,
      className:  js.UndefOr[String]                = js.undefined,
      classes:    Map[String, String]               = Map.empty,
      deleteIcon: js.UndefOr[ReactElement]          = js.undefined,
      label:      js.UndefOr[ReactElement]          = js.undefined,
      onClick:    ReactHandler1[ReactMouseEvent]    = js.undefined,
      onKeyDown:  ReactHandler1[ReactKeyboardEvent] = js.undefined,
      onDelete:   ReactHandler1[ReactEvent]         = js.undefined,
      tabIndex:   js.UndefOr[Int | String]          = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      avatar,
      className,
      classes,
      deleteIcon,
      label,
      onClick,
      onKeyDown,
      onDelete,
      tabIndex,
      otherProps: _*
    )
    component(p)
  }
}
