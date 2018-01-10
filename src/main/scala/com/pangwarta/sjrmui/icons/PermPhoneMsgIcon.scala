package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PermPhoneMsgIcon {

  @JSImport("material-ui-icons", "PermPhoneMsg")
  @js.native
  private object RawComponent extends js.Object
  private val PermPhoneMsg = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PermPhoneMsg()
}

