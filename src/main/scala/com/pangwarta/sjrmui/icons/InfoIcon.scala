package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InfoIcon {

  @JSImport("material-ui-icons", "Info")
  @js.native
  private object RawComponent extends js.Object
  private val Info = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Info()
}

