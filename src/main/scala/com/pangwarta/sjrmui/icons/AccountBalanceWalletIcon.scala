package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AccountBalanceWalletIcon {

  @JSImport("material-ui-icons", "AccountBalanceWallet")
  @js.native
  private object RawComponent extends js.Object
  private val AccountBalanceWallet = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AccountBalanceWallet()
}

