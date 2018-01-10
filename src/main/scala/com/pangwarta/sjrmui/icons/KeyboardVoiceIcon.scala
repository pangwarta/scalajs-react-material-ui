package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object KeyboardVoiceIcon {

  @JSImport("material-ui-icons", "KeyboardVoice")
  @js.native
  private object RawComponent extends js.Object
  private val KeyboardVoice = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = KeyboardVoice()
}

