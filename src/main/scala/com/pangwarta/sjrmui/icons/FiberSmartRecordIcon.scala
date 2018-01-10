package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FiberSmartRecordIcon {

  @JSImport("material-ui-icons", "FiberSmartRecord")
  @js.native
  private object RawComponent extends js.Object
  private val FiberSmartRecord = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FiberSmartRecord()
}

