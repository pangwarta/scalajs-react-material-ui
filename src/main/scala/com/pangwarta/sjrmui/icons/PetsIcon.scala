package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PetsIcon {

  @JSImport("material-ui-icons", "Pets")
  @js.native
  private object RawComponent extends js.Object
  private val Pets = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Pets()
}

