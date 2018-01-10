package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MapIcon {

  @JSImport("material-ui-icons", "Map")
  @js.native
  private object RawComponent extends js.Object
  private val Map = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Map()
}

