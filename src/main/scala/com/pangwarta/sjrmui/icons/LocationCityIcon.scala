package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocationCityIcon {

  @JSImport("material-ui-icons", "LocationCity")
  @js.native
  private object RawComponent extends js.Object
  private val LocationCity = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocationCity()
}

