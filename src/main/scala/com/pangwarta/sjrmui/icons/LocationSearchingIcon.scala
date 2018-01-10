package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocationSearchingIcon {

  @JSImport("material-ui-icons", "LocationSearching")
  @js.native
  private object RawComponent extends js.Object
  private val LocationSearching = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocationSearching()
}

