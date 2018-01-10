package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PartyModeIcon {

  @JSImport("material-ui-icons", "PartyMode")
  @js.native
  private object RawComponent extends js.Object
  private val PartyMode = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PartyMode()
}

