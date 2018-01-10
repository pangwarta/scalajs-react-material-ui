package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TimeToLeaveIcon {

  @JSImport("material-ui-icons", "TimeToLeave")
  @js.native
  private object RawComponent extends js.Object
  private val TimeToLeave = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TimeToLeave()
}

