package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DesktopMacIcon {

  @JSImport("material-ui-icons", "DesktopMac")
  @js.native
  private object RawComponent extends js.Object
  private val DesktopMac = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DesktopMac()
}

