package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ShareIcon {

  @JSImport("material-ui-icons", "Share")
  @js.native
  private object RawComponent extends js.Object
  private val Share = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Share()
}

