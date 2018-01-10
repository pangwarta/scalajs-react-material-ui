package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhoneInTalkIcon {

  @JSImport("material-ui-icons", "PhoneInTalk")
  @js.native
  private object RawComponent extends js.Object
  private val PhoneInTalk = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhoneInTalk()
}

