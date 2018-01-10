package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StopIcon {

  @JSImport("material-ui-icons", "Stop")
  @js.native
  private object RawComponent extends js.Object
  private val Stop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Stop()
}

