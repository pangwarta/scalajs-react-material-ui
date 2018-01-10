package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AcUnitIcon {

  @JSImport("material-ui-icons", "AcUnit")
  @js.native
  private object RawComponent extends js.Object
  private val AcUnit = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AcUnit()
}

