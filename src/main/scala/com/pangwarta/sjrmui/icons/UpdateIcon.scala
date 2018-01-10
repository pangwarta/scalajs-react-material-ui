package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object UpdateIcon {

  @JSImport("material-ui-icons", "Update")
  @js.native
  private object RawComponent extends js.Object
  private val Update = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Update()
}

