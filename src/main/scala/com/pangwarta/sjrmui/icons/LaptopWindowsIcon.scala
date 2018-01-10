package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LaptopWindowsIcon {

  @JSImport("material-ui-icons", "LaptopWindows")
  @js.native
  private object RawComponent extends js.Object
  private val LaptopWindows = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LaptopWindows()
}

