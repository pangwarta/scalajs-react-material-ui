package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloudCircleIcon {

  @JSImport("material-ui-icons", "CloudCircle")
  @js.native
  private object RawComponent extends js.Object
  private val CloudCircle = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CloudCircle()
}

