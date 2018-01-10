package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PauseCircleFilledIcon {

  @JSImport("material-ui-icons", "PauseCircleFilled")
  @js.native
  private object RawComponent extends js.Object
  private val PauseCircleFilled = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PauseCircleFilled()
}

