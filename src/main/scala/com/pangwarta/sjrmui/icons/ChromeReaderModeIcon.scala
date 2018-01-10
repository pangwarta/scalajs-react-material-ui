package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ChromeReaderModeIcon {

  @JSImport("material-ui-icons", "ChromeReaderMode")
  @js.native
  private object RawComponent extends js.Object
  private val ChromeReaderMode = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ChromeReaderMode()
}

