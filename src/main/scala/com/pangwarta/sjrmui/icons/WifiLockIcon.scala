package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WifiLockIcon {

  @JSImport("material-ui-icons", "WifiLock")
  @js.native
  private object RawComponent extends js.Object
  private val WifiLock = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = WifiLock()
}

