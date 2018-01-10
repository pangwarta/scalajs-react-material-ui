package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RepeatIcon {

  @JSImport("material-ui-icons", "Repeat")
  @js.native
  private object RawComponent extends js.Object
  private val Repeat = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Repeat()
}

