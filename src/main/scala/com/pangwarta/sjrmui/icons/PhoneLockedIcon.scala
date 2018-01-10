package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhoneLockedIcon {

  @JSImport("material-ui-icons", "PhoneLocked")
  @js.native
  private object RawComponent extends js.Object
  private val PhoneLocked = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhoneLocked()
}

