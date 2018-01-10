package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react._
import japgolly.scalajs.react.raw.ReactElement
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Backdrop {

  @JSImport("material-ui", "Backdrop")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String] = js.native
    var invisible: js.UndefOr[Boolean] = js.native
    var open: Boolean = js.native
    var transitionDuration: js.UndefOr[Transition.Duration] = js.native
  }

  private def props(
      classes:            js.Dictionary[String],
      invisible:          js.UndefOr[Boolean],
      open:               Boolean,
      transitionDuration: js.UndefOr[Transition.Duration],
      otherProps:         (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(
      classes            = classes,
      invisible          = invisible,
      open               = open,
      transitionDuration = transitionDuration
    )
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object invisible extends ClassKey("invisible")

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
      classes:            Map[String, String]             = Map.empty,
      invisible:          js.UndefOr[Boolean]             = false,
      open:               Boolean,
      transitionDuration: js.UndefOr[Transition.Duration] = js.undefined
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      classes,
      invisible,
      open,
      transitionDuration,
      otherProps: _*
    )
    component(p)
  }
}
