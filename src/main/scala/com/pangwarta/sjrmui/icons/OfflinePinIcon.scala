package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object OfflinePinIcon {

  @JSImport("material-ui-icons", "OfflinePin")
  @js.native
  private object RawComponent extends js.Object
  private val OfflinePin = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = OfflinePin()
}

