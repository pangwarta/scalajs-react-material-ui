package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object QueueIcon {

  @JSImport("material-ui-icons", "Queue")
  @js.native
  private object RawComponent extends js.Object
  private val Queue = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Queue()
}

