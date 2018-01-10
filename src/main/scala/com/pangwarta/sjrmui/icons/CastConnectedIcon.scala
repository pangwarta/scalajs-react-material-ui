package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CastConnectedIcon {

  @JSImport("material-ui-icons", "CastConnected")
  @js.native
  private object RawComponent extends js.Object
  private val CastConnected = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CastConnected()
}

