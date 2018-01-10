package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SmsIcon {

  @JSImport("material-ui-icons", "Sms")
  @js.native
  private object RawComponent extends js.Object
  private val Sms = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Sms()
}

