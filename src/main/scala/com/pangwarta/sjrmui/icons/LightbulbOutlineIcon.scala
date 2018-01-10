package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LightbulbOutlineIcon {

  @JSImport("material-ui-icons", "LightbulbOutline")
  @js.native
  private object RawComponent extends js.Object
  private val LightbulbOutline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LightbulbOutline()
}

