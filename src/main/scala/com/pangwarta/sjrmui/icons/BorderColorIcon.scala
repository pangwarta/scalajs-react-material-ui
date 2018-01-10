package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderColorIcon {

  @JSImport("material-ui-icons", "BorderColor")
  @js.native
  private object RawComponent extends js.Object
  private val BorderColor = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderColor()
}

