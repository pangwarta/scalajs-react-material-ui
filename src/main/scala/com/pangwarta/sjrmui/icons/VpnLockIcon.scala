package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VpnLockIcon {

  @JSImport("material-ui-icons", "VpnLock")
  @js.native
  private object RawComponent extends js.Object
  private val VpnLock = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VpnLock()
}

