package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TerrainIcon {

  @JSImport("material-ui-icons", "Terrain")
  @js.native
  private object RawComponent extends js.Object
  private val Terrain = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Terrain()
}

