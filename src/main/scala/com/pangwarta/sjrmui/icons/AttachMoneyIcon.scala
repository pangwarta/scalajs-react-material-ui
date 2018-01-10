package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AttachMoneyIcon {

  @JSImport("material-ui-icons", "AttachMoney")
  @js.native
  private object RawComponent extends js.Object
  private val AttachMoney = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AttachMoney()
}

