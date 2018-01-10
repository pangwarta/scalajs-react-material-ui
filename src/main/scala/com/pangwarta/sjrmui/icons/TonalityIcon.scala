package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TonalityIcon {

  @JSImport("material-ui-icons", "Tonality")
  @js.native
  private object RawComponent extends js.Object
  private val Tonality = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Tonality()
}

