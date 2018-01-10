package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SurroundSoundIcon {

  @JSImport("material-ui-icons", "SurroundSound")
  @js.native
  private object RawComponent extends js.Object
  private val SurroundSound = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SurroundSound()
}

