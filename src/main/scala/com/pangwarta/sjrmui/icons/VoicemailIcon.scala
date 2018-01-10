package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VoicemailIcon {

  @JSImport("material-ui-icons", "Voicemail")
  @js.native
  private object RawComponent extends js.Object
  private val Voicemail = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Voicemail()
}

