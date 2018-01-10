package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HttpIcon {

  @JSImport("material-ui-icons", "Http")
  @js.native
  private object RawComponent extends js.Object
  private val Http = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Http()
}

