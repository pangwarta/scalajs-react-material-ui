package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DataUsageIcon {

  @JSImport("material-ui-icons", "DataUsage")
  @js.native
  private object RawComponent extends js.Object
  private val DataUsage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DataUsage()
}

