package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AccessAlarmIcon {

  @JSImport("material-ui-icons", "AccessAlarm")
  @js.native
  private object RawComponent extends js.Object
  private val AccessAlarm = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AccessAlarm()
}

