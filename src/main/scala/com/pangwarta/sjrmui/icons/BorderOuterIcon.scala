package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BorderOuterIcon {

  @JSImport("material-ui-icons", "BorderOuter")
  @js.native
  private object RawComponent extends js.Object
  private val BorderOuter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BorderOuter()
}

