package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlashOffIcon {

  @JSImport("material-ui-icons", "FlashOff")
  @js.native
  private object RawComponent extends js.Object
  private val FlashOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlashOff()
}

