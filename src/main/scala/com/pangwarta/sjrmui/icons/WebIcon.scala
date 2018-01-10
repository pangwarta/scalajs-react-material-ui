package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WebIcon {

  @JSImport("material-ui-icons", "Web")
  @js.native
  private object RawComponent extends js.Object
  private val Web = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Web()
}

