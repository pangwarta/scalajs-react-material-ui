package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FitnessCenterIcon {

  @JSImport("material-ui-icons", "FitnessCenter")
  @js.native
  private object RawComponent extends js.Object
  private val FitnessCenter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FitnessCenter()
}

