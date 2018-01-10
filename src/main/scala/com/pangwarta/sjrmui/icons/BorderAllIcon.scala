package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderAllIcon {

  @JSImport("material-ui-icons", "BorderAll")
  @js.native
  private object RawComponent extends js.Object
  private val BorderAll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderAll()
}

