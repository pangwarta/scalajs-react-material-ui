package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalTaxiIcon {

  @JSImport("material-ui-icons", "LocalTaxi")
  @js.native
  private object RawComponent extends js.Object
  private val LocalTaxi = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalTaxi()
}

