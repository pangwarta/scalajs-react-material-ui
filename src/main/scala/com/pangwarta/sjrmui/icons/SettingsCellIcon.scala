package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsCellIcon {

  @JSImport("material-ui-icons", "SettingsCell")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsCell = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsCell()
}

