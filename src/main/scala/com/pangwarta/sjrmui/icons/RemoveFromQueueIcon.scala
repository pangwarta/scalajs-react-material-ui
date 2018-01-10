package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RemoveFromQueueIcon {

  @JSImport("material-ui-icons", "RemoveFromQueue")
  @js.native
  private object RawComponent extends js.Object
  private val RemoveFromQueue = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RemoveFromQueue()
}

