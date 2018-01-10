package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderStyleIcon {

  @JSImport("material-ui-icons", "BorderStyle")
  @js.native
  private object RawComponent extends js.Object
  private val BorderStyle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderStyle()
}

