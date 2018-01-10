package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ContactsIcon {

  @JSImport("material-ui-icons", "Contacts")
  @js.native
  private object RawComponent extends js.Object
  private val Contacts = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Contacts()
}

