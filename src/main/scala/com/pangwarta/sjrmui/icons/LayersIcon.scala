package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LayersIcon {

  @JSImport("material-ui-icons", "Layers")
  @js.native
  private object RawComponent extends js.Object
  private val Layers = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Layers()
}

