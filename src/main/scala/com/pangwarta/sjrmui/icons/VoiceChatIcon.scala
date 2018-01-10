package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VoiceChatIcon {

  @JSImport("material-ui-icons", "VoiceChat")
  @js.native
  private object RawComponent extends js.Object
  private val VoiceChat = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VoiceChat()
}

