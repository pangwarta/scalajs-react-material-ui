package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TabletIcon {

  @JSImport("material-ui-icons", "Tablet")
  @js.native
  private object RawComponent extends js.Object
  private val Tablet = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Tablet()
}

