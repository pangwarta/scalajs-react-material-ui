package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LoopIcon {

  @JSImport("material-ui-icons", "Loop")
  @js.native
  private object RawComponent extends js.Object
  private val Loop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Loop()
}

