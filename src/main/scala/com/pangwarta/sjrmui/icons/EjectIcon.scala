package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EjectIcon {

  @JSImport("material-ui-icons", "Eject")
  @js.native
  private object RawComponent extends js.Object
  private val Eject = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Eject()
}

