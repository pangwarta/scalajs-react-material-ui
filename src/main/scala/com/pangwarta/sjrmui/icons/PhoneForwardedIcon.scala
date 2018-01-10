package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhoneForwardedIcon {

  @JSImport("material-ui-icons", "PhoneForwarded")
  @js.native
  private object RawComponent extends js.Object
  private val PhoneForwarded = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhoneForwarded()
}

