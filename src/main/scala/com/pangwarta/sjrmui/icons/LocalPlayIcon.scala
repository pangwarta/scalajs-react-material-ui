package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalPlayIcon {

  @JSImport("material-ui-icons", "LocalPlay")
  @js.native
  private object RawComponent extends js.Object
  private val LocalPlay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalPlay()
}

