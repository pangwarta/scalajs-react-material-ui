package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SimCardIcon {

  @JSImport("material-ui-icons", "SimCard")
  @js.native
  private object RawComponent extends js.Object
  private val SimCard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SimCard()
}

