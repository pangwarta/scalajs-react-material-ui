package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AdjustIcon {

  @JSImport("material-ui-icons", "Adjust")
  @js.native
  private object RawComponent extends js.Object
  private val Adjust = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Adjust()
}

