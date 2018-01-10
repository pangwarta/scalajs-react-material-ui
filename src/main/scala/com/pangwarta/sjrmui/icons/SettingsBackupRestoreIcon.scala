package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsBackupRestoreIcon {

  @JSImport("material-ui-icons", "SettingsBackupRestore")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsBackupRestore = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsBackupRestore()
}

