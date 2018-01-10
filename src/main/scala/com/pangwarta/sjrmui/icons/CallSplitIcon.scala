package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CallSplitIcon {

  @JSImport("material-ui-icons", "CallSplit")
  @js.native
  private object RawComponent extends js.Object
  private val CallSplit = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CallSplit()
}

