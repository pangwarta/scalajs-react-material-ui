package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FiberDvrIcon {

  @JSImport("material-ui-icons", "FiberDvr")
  @js.native
  private object RawComponent extends js.Object
  private val FiberDvr = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FiberDvr()
}

