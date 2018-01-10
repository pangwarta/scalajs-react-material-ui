package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PanToolIcon {

  @JSImport("material-ui-icons", "PanTool")
  @js.native
  private object RawComponent extends js.Object
  private val PanTool = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PanTool()
}

