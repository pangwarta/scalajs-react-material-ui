package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhoneMissedIcon {

  @JSImport("material-ui-icons", "PhoneMissed")
  @js.native
  private object RawComponent extends js.Object
  private val PhoneMissed = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhoneMissed()
}

