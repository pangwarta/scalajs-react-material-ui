package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LensIcon {

  @JSImport("material-ui-icons", "Lens")
  @js.native
  private object RawComponent extends js.Object
  private val Lens = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Lens()
}

