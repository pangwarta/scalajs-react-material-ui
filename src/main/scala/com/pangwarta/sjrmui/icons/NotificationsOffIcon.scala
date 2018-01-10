package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NotificationsOffIcon {

  @JSImport("material-ui-icons", "NotificationsOff")
  @js.native
  private object RawComponent extends js.Object
  private val NotificationsOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NotificationsOff()
}

