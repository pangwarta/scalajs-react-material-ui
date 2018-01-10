package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LinearScaleIcon {

  @JSImport("material-ui-icons", "LinearScale")
  @js.native
  private object RawComponent extends js.Object
  private val LinearScale = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LinearScale()
}

