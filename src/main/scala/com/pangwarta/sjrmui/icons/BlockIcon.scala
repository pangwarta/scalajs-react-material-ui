package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BlockIcon {

  @JSImport("material-ui-icons", "Block")
  @js.native
  private object RawComponent extends js.Object
  private val Block = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Block()
}

