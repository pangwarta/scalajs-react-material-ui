package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpeakerGroupIcon {

  @JSImport("material-ui-icons", "SpeakerGroup")
  @js.native
  private object RawComponent extends js.Object
  private val SpeakerGroup = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SpeakerGroup()
}

