package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MemoryIcon {

  @JSImport("material-ui-icons", "Memory")
  @js.native
  private object RawComponent extends js.Object
  private val Memory = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Memory()
}

