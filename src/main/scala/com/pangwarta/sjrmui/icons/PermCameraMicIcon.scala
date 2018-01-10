package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PermCameraMicIcon {

  @JSImport("material-ui-icons", "PermCameraMic")
  @js.native
  private object RawComponent extends js.Object
  private val PermCameraMic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PermCameraMic()
}

