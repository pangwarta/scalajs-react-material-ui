package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MoodIcon {

  @JSImport("material-ui-icons", "Mood")
  @js.native
  private object RawComponent extends js.Object
  private val Mood = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Mood()
}

