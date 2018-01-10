package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ForwardIcon {

  @JSImport("material-ui-icons", "Forward")
  @js.native
  private object RawComponent extends js.Object
  private val Forward = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Forward()
}

