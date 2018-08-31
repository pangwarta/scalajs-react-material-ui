package com.pangwarta.sjrmui

import japgolly.scalajs.react.vdom.VdomNode
import japgolly.scalajs.react.{Children, JsComponent}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Toolbar {

  private val component = JsComponent[Props, Children.Varargs, Null](RawComponent)

  def apply(
    classes: Map[ClassKey, String] = Map.empty,
    className: js.UndefOr[String] = js.undefined,
    disableGutters: js.UndefOr[Boolean] = js.undefined
  )(otherProps: (String, js.Any)*)(children: VdomNode*) = {
    val p = props(
      classes,
      className,
      disableGutters,
      otherProps: _*
    )
    this.component(p)(children: _*)
  }

  private def props(
    classes: js.Dictionary[String],
    className: js.UndefOr[String],
    disableGutters: js.UndefOr[Boolean],
    otherProps: (String, js.Any)*
  ): Props = {
    val p = js.Dynamic.literal(classes = classes)
    className.foreach(p.updateDynamic("className")(_))
    disableGutters.foreach(p.updateDynamic("disableGutters")(_))
    addOtherProps(p, otherProps: _*)
    p.asInstanceOf[Props]
  }

  @js.native
  private[sjrmui] trait Props extends js.Object {
    var classes: js.Dictionary[String]      = js.native
    var className: js.UndefOr[String]       = js.native
    var disableGutters: js.UndefOr[Boolean] = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType

  object ClassKey {
    object root    extends ClassKey("root")
    object gutters extends ClassKey("gutters")
  }

  @JSImport("@material-ui/core", "Toolbar")
  @js.native
  private object RawComponent extends js.Object
}
