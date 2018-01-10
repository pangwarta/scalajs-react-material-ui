package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ClearAllIcon {

  @JSImport("material-ui-icons", "ClearAll")
  @js.native
  private object RawComponent extends js.Object
  private val ClearAll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ClearAll()
}

