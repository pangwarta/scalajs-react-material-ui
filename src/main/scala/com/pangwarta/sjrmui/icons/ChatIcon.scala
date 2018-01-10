package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChatIcon {

  @JSImport("material-ui-icons", "Chat")
  @js.native
  private object RawComponent extends js.Object
  private val Chat = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Chat()
}

