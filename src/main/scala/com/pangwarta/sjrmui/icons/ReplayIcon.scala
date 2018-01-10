package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ReplayIcon {

  @JSImport("material-ui-icons", "Replay")
  @js.native
  private object RawComponent extends js.Object
  private val Replay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Replay()
}

