package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ExitToAppIcon {

  @JSImport("material-ui-icons", "ExitToApp")
  @js.native
  private object RawComponent extends js.Object
  private val ExitToApp = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ExitToApp()
}

