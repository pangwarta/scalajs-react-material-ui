package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MyLocationIcon {

  @JSImport("material-ui-icons", "MyLocation")
  @js.native
  private object RawComponent extends js.Object
  private val MyLocation = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MyLocation()
}

