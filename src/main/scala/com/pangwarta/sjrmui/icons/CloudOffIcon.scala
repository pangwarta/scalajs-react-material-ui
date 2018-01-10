package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloudOffIcon {

  @JSImport("material-ui-icons", "CloudOff")
  @js.native
  private object RawComponent extends js.Object
  private val CloudOff = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CloudOff()
}

