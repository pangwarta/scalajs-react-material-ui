package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RemoveRedEyeIcon {

  @JSImport("material-ui-icons", "RemoveRedEye")
  @js.native
  private object RawComponent extends js.Object
  private val RemoveRedEye = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RemoveRedEye()
}

