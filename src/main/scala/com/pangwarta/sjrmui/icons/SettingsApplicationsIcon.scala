package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsApplicationsIcon {

  @JSImport("material-ui-icons", "SettingsApplications")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsApplications = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsApplications()
}

