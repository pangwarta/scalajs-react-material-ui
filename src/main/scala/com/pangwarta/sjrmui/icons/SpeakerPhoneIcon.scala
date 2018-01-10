package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpeakerPhoneIcon {

  @JSImport("material-ui-icons", "SpeakerPhone")
  @js.native
  private object RawComponent extends js.Object
  private val SpeakerPhone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SpeakerPhone()
}

