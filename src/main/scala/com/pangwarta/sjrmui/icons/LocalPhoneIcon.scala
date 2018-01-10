package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalPhoneIcon {

  @JSImport("material-ui-icons", "LocalPhone")
  @js.native
  private object RawComponent extends js.Object
  private val LocalPhone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalPhone()
}

