package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SyncIcon {

  @JSImport("material-ui-icons", "Sync")
  @js.native
  private object RawComponent extends js.Object
  private val Sync = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Sync()
}

