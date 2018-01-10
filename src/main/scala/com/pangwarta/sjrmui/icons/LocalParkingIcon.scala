package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalParkingIcon {

  @JSImport("material-ui-icons", "LocalParking")
  @js.native
  private object RawComponent extends js.Object
  private val LocalParking = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalParking()
}

