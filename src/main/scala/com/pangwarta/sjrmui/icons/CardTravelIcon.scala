package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CardTravelIcon {

  @JSImport("material-ui-icons", "CardTravel")
  @js.native
  private object RawComponent extends js.Object
  private val CardTravel = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CardTravel()
}

