package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ImportContactsIcon {

  @JSImport("material-ui-icons", "ImportContacts")
  @js.native
  private object RawComponent extends js.Object
  private val ImportContacts = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ImportContacts()
}

