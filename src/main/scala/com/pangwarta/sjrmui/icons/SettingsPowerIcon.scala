package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SettingsPowerIcon {

  @JSImport("material-ui-icons", "SettingsPower")
  @js.native
  private object RawComponent extends js.Object
  private val SettingsPower = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SettingsPower()
}

