package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SimCardAlertIcon {

  @JSImport("material-ui-icons", "SimCardAlert")
  @js.native
  private object RawComponent extends js.Object
  private val SimCardAlert = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SimCardAlert()
}

