package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StreetviewIcon {

  @JSImport("material-ui-icons", "Streetview")
  @js.native
  private object RawComponent extends js.Object
  private val Streetview = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Streetview()
}

