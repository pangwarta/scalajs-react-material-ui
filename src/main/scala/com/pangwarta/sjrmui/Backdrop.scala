package com.pangwarta.sjrmui

import com.pangwarta.sjrmui.internal.Transition
import japgolly.scalajs.react.{ CtorType, _ }
import japgolly.scalajs.react.component.Js.{ Component, RawMounted, UnmountedWithRawType }

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Backdrop {

  @JSImport("material-ui", "Backdrop")
  @js.native
  private object RawComponent extends js.Object

  @js.native
  trait Props extends js.Object {
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
      classes = classes,
      open    = open
    )
    invisible.foreach(p.updateDynamic("invisible")(_))
    transitionDuration.foreach(p.updateDynamic("transitionDuration")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object root extends ClassKey("root")
  object invisible extends ClassKey("invisible")

  val component = JsComponent[Props, Children.None, Null](RawComponent)

  def apply(
      classes:            Map[String, String]             = Map.empty,
      invisible:          js.UndefOr[Boolean]             = js.undefined,
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
