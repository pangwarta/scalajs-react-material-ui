package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsIcon {

  @JSImport("material-ui-icons", "Settings")
  @js.native
  private object RawComponent extends js.Object
  private val Settings = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Settings()
}

