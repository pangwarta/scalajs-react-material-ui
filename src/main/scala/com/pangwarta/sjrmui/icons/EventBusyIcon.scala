package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EventBusyIcon {

  @JSImport("material-ui-icons", "EventBusy")
  @js.native
  private object RawComponent extends js.Object
  private val EventBusy = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = EventBusy()
}

