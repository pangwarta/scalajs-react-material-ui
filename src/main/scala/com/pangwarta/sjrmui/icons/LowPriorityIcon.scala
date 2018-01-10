package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LowPriorityIcon {

  @JSImport("material-ui-icons", "LowPriority")
  @js.native
  private object RawComponent extends js.Object
  private val LowPriority = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LowPriority()
}

