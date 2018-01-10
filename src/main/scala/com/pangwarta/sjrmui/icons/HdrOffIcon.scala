package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HdrOffIcon {

  @JSImport("material-ui-icons", "HdrOff")
  @js.native
  private object RawComponent extends js.Object
  private val HdrOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HdrOff()
}

