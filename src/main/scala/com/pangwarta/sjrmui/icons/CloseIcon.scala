package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloseIcon {

  @JSImport("material-ui-icons", "Close")
  @js.native
  private object RawComponent extends js.Object
  private val Close = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Close()
}

