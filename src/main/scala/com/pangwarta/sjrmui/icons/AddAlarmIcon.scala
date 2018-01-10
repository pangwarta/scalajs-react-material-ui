package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddAlarmIcon {

  @JSImport("material-ui-icons", "AddAlarm")
  @js.native
  private object RawComponent extends js.Object
  private val AddAlarm = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddAlarm()
}

