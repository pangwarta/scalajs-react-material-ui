package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HttpsIcon {

  @JSImport("material-ui-icons", "Https")
  @js.native
  private object RawComponent extends js.Object
  private val Https = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Https()
}

