package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TimelineIcon {

  @JSImport("material-ui-icons", "Timeline")
  @js.native
  private object RawComponent extends js.Object
  private val Timeline = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Timeline()
}

