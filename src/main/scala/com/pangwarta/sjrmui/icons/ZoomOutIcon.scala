package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ZoomOutIcon {

  @JSImport("material-ui-icons", "ZoomOut")
  @js.native
  private object RawComponent extends js.Object
  private val ZoomOut = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ZoomOut()
}

