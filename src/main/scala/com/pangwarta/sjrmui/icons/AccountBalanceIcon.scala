package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AccountBalanceIcon {

  @JSImport("material-ui-icons", "AccountBalance")
  @js.native
  private object RawComponent extends js.Object
  private val AccountBalance = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AccountBalance()
}

