package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderTopIcon {

  @JSImport("material-ui-icons", "BorderTop")
  @js.native
  private object RawComponent extends js.Object
  private val BorderTop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderTop()
}

