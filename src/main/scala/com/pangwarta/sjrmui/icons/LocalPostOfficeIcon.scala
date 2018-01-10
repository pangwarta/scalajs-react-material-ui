package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalPostOfficeIcon {

  @JSImport("material-ui-icons", "LocalPostOffice")
  @js.native
  private object RawComponent extends js.Object
  private val LocalPostOffice = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalPostOffice()
}

