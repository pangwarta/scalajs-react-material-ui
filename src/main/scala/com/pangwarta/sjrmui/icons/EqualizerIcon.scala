package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EqualizerIcon {

  @JSImport("material-ui-icons", "Equalizer")
  @js.native
  private object RawComponent extends js.Object
  private val Equalizer = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Equalizer()
}

