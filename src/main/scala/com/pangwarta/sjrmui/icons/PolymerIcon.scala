package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PolymerIcon {

  @JSImport("material-ui-icons", "Polymer")
  @js.native
  private object RawComponent extends js.Object
  private val Polymer = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Polymer()
}

