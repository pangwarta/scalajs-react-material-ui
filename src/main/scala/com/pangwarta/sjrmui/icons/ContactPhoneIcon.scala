package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ContactPhoneIcon {

  @JSImport("material-ui-icons", "ContactPhone")
  @js.native
  private object RawComponent extends js.Object
  private val ContactPhone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ContactPhone()
}

