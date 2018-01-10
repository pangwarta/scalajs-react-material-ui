package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PortraitIcon {

  @JSImport("material-ui-icons", "Portrait")
  @js.native
  private object RawComponent extends js.Object
  private val Portrait = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Portrait()
}

