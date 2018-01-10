package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NotificationsActiveIcon {

  @JSImport("material-ui-icons", "NotificationsActive")
  @js.native
  private object RawComponent extends js.Object
  private val NotificationsActive = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NotificationsActive()
}

