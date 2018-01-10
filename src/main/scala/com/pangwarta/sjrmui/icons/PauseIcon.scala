package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PauseIcon {

  @JSImport("material-ui-icons", "Pause")
  @js.native
  private object RawComponent extends js.Object
  private val Pause = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Pause()
}

