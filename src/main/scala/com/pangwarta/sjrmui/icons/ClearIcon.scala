package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ClearIcon {

  @JSImport("material-ui-icons", "Clear")
  @js.native
  private object RawComponent extends js.Object
  private val Clear = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Clear()
}

