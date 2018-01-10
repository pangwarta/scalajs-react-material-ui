package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CreateIcon {

  @JSImport("material-ui-icons", "Create")
  @js.native
  private object RawComponent extends js.Object
  private val Create = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Create()
}

