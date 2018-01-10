package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SnoozeIcon {

  @JSImport("material-ui-icons", "Snooze")
  @js.native
  private object RawComponent extends js.Object
  private val Snooze = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Snooze()
}

