package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SyncDisabledIcon {

  @JSImport("material-ui-icons", "SyncDisabled")
  @js.native
  private object RawComponent extends js.Object
  private val SyncDisabled = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SyncDisabled()
}

