package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FlashAutoIcon {

  @JSImport("material-ui-icons", "FlashAuto")
  @js.native
  private object RawComponent extends js.Object
  private val FlashAuto = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FlashAuto()
}

