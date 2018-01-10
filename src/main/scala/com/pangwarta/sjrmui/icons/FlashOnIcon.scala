package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlashOnIcon {

  @JSImport("material-ui-icons", "FlashOn")
  @js.native
  private object RawComponent extends js.Object
  private val FlashOn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlashOn()
}

