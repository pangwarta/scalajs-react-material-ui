package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PanoramaVerticalIcon {

  @JSImport("material-ui-icons", "PanoramaVertical")
  @js.native
  private object RawComponent extends js.Object
  private val PanoramaVertical = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PanoramaVertical()
}

