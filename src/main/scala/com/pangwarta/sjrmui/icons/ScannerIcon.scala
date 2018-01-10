package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ScannerIcon {

  @JSImport("material-ui-icons", "Scanner")
  @js.native
  private object RawComponent extends js.Object
  private val Scanner = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Scanner()
}

