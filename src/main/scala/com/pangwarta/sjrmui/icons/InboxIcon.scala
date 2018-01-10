package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InboxIcon {

  @JSImport("material-ui-icons", "Inbox")
  @js.native
  private object RawComponent extends js.Object
  private val Inbox = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Inbox()
}

