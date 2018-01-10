package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NetworkLockedIcon {

  @JSImport("material-ui-icons", "NetworkLocked")
  @js.native
  private object RawComponent extends js.Object
  private val NetworkLocked = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NetworkLocked()
}

