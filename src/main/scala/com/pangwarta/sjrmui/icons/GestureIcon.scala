package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GestureIcon {

  @JSImport("material-ui-icons", "Gesture")
  @js.native
  private object RawComponent extends js.Object
  private val Gesture = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Gesture()
}

