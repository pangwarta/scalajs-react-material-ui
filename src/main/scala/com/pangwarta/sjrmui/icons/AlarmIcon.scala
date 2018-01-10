package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AlarmIcon {

  @JSImport("material-ui-icons", "Alarm")
  @js.native
  private object RawComponent extends js.Object
  private val Alarm = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Alarm()
}

