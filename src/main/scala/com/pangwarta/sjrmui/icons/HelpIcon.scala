package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HelpIcon {

  @JSImport("material-ui-icons", "Help")
  @js.native
  private object RawComponent extends js.Object
  private val Help = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Help()
}

