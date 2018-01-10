package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DehazeIcon {

  @JSImport("material-ui-icons", "Dehaze")
  @js.native
  private object RawComponent extends js.Object
  private val Dehaze = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Dehaze()
}

