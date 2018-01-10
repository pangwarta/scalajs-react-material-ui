package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LaunchIcon {

  @JSImport("material-ui-icons", "Launch")
  @js.native
  private object RawComponent extends js.Object
  private val Launch = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Launch()
}

