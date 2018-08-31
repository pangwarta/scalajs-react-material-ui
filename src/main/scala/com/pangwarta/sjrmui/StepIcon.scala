package com.pangwarta.sjrmui

import japgolly.scalajs.react.raw.React.{Node => ReactNode}
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object StepIcon {

  private val component = JsComponent[Props, Children.None, Null](RawComponent)

  private def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    classes: Map[ClassKey, String] = Map.empty,
    completed: js.UndefOr[Boolean] = js.undefined,
    icon: ReactNode
  )(otherProps: (String, js.Any)*) = {
    val p = props(
      active,
      classes,
      completed,
      icon,
      otherProps: _*
    )
    this.component(p)
  }

  private def props(
    active: js.UndefOr[Boolean],
    classes: js.Dictionary[String],
    completed: js.UndefOr[Boolean],
    icon: ReactNode,
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes, icon = icon)
    active.foreach(p.updateDynamic("active")(_))
    completed.foreach(p.updateDynamic("completed")(_))
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var active: js.UndefOr[Boolean]    = js.native
    var classes: js.Dictionary[String] = js.native
    var completed: js.UndefOr[Boolean] = js.native
    var icon: ReactNode                = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object ClassKey {
    object root      extends ClassKey("root")
    object completed extends ClassKey("completed")
  }

  @JSImport("@material-ui/core", "StepIcon")
  @js.native
  private object RawComponent extends js.Object
}
