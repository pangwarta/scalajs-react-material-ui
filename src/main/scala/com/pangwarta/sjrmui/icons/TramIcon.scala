package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TramIcon {

  @JSImport("material-ui-icons", "Tram")
  @js.native
  private object RawComponent extends js.Object
  private val Tram = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Tram()
}

