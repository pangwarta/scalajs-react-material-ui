package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsRemoteIcon {

  @JSImport("material-ui-icons", "SettingsRemote")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsRemote = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsRemote()
}

