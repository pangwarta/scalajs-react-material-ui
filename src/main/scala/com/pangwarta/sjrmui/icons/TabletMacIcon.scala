package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TabletMacIcon {

  @JSImport("material-ui-icons", "TabletMac")
  @js.native
  private object RawComponent extends js.Object
  private val TabletMac = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TabletMac()
}

