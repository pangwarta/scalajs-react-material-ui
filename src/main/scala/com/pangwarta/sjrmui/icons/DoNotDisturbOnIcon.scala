package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DoNotDisturbOnIcon {

  @JSImport("material-ui-icons", "DoNotDisturbOn")
  @js.native
  private object RawComponent extends js.Object
  private val DoNotDisturbOn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DoNotDisturbOn()
}

