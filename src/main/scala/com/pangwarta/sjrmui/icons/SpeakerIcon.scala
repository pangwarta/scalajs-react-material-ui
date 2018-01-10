package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SpeakerIcon {

  @JSImport("material-ui-icons", "Speaker")
  @js.native
  private object RawComponent extends js.Object
  private val Speaker = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Speaker()
}

