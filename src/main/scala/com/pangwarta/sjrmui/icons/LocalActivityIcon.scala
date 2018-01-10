package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalActivityIcon {

  @JSImport("material-ui-icons", "LocalActivity")
  @js.native
  private object RawComponent extends js.Object
  private val LocalActivity = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalActivity()
}

