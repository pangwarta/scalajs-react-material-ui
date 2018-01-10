package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RadioIcon {

  @JSImport("material-ui-icons", "Radio")
  @js.native
  private object RawComponent extends js.Object
  private val Radio = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Radio()
}

