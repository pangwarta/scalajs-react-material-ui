package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CreditCardIcon {

  @JSImport("material-ui-icons", "CreditCard")
  @js.native
  private object RawComponent extends js.Object
  private val CreditCard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CreditCard()
}

