package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PresentToAllIcon {

  @JSImport("material-ui-icons", "PresentToAll")
  @js.native
  private object RawComponent extends js.Object
  private val PresentToAll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PresentToAll()
}

