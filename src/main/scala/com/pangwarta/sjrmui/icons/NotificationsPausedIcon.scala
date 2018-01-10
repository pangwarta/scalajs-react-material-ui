package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NotificationsPausedIcon {

  @JSImport("material-ui-icons", "NotificationsPaused")
  @js.native
  private object RawComponent extends js.Object
  private val NotificationsPaused = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NotificationsPaused()
}

