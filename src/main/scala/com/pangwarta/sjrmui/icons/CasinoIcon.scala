package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CasinoIcon {

  @JSImport("material-ui-icons", "Casino")
  @js.native
  private object RawComponent extends js.Object
  private val Casino = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Casino()
}

