package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DeveloperModeIcon {

  @JSImport("material-ui-icons", "DeveloperMode")
  @js.native
  private object RawComponent extends js.Object
  private val DeveloperMode = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DeveloperMode()
}

