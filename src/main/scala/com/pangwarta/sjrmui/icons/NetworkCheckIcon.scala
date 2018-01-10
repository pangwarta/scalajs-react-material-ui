package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NetworkCheckIcon {

  @JSImport("material-ui-icons", "NetworkCheck")
  @js.native
  private object RawComponent extends js.Object
  private val NetworkCheck = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NetworkCheck()
}

