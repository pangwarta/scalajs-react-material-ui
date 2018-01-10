package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HdrOnIcon {

  @JSImport("material-ui-icons", "HdrOn")
  @js.native
  private object RawComponent extends js.Object
  private val HdrOn = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HdrOn()
}

