package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VignetteIcon {

  @JSImport("material-ui-icons", "Vignette")
  @js.native
  private object RawComponent extends js.Object
  private val Vignette = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Vignette()
}

