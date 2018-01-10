package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DialerSipIcon {

  @JSImport("material-ui-icons", "DialerSip")
  @js.native
  private object RawComponent extends js.Object
  private val DialerSip = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DialerSip()
}

