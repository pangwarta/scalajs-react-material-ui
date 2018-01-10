package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AdbIcon {

  @JSImport("material-ui-icons", "Adb")
  @js.native
  private object RawComponent extends js.Object
  private val Adb = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Adb()
}

