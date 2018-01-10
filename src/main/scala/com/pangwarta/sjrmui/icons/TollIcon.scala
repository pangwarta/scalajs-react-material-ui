package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TollIcon {

  @JSImport("material-ui-icons", "Toll")
  @js.native
  private object RawComponent extends js.Object
  private val Toll = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Toll()
}

