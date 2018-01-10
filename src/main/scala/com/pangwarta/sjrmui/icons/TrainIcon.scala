package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TrainIcon {

  @JSImport("material-ui-icons", "Train")
  @js.native
  private object RawComponent extends js.Object
  private val Train = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Train()
}

