package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AlarmOffIcon {

  @JSImport("material-ui-icons", "AlarmOff")
  @js.native
  private object RawComponent extends js.Object
  private val AlarmOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AlarmOff()
}

