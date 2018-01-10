package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PaymentIcon {

  @JSImport("material-ui-icons", "Payment")
  @js.native
  private object RawComponent extends js.Object
  private val Payment = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Payment()
}

