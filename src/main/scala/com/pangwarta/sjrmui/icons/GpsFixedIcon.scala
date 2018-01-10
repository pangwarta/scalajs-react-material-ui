package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GpsFixedIcon {

  @JSImport("material-ui-icons", "GpsFixed")
  @js.native
  private object RawComponent extends js.Object
  private val GpsFixed = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GpsFixed()
}

