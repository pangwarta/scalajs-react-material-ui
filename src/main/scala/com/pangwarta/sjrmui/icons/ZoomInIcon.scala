package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ZoomInIcon {

  @JSImport("material-ui-icons", "ZoomIn")
  @js.native
  private object RawComponent extends js.Object
  private val ZoomIn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ZoomIn()
}

