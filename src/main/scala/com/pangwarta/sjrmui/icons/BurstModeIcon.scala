package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BurstModeIcon {

  @JSImport("material-ui-icons", "BurstMode")
  @js.native
  private object RawComponent extends js.Object
  private val BurstMode = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BurstMode()
}

