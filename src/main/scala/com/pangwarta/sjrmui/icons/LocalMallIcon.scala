package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalMallIcon {

  @JSImport("material-ui-icons", "LocalMall")
  @js.native
  private object RawComponent extends js.Object
  private val LocalMall = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalMall()
}

