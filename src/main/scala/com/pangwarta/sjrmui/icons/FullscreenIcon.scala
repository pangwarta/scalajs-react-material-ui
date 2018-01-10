package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FullscreenIcon {

  @JSImport("material-ui-icons", "Fullscreen")
  @js.native
  private object RawComponent extends js.Object
  private val Fullscreen = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Fullscreen()
}

