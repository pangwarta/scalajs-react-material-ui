package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AddToQueueIcon {

  @JSImport("material-ui-icons", "AddToQueue")
  @js.native
  private object RawComponent extends js.Object
  private val AddToQueue = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AddToQueue()
}

