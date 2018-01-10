package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MoodBadIcon {

  @JSImport("material-ui-icons", "MoodBad")
  @js.native
  private object RawComponent extends js.Object
  private val MoodBad = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MoodBad()
}

