package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SwapCallsIcon {

  @JSImport("material-ui-icons", "SwapCalls")
  @js.native
  private object RawComponent extends js.Object
  private val SwapCalls = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SwapCalls()
}

