package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DeleteForeverIcon {

  @JSImport("material-ui-icons", "DeleteForever")
  @js.native
  private object RawComponent extends js.Object
  private val DeleteForever = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = DeleteForever()
}

