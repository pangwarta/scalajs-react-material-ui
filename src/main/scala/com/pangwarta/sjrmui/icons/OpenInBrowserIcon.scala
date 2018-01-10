package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object OpenInBrowserIcon {

  @JSImport("material-ui-icons", "OpenInBrowser")
  @js.native
  private object RawComponent extends js.Object
  private val OpenInBrowser = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = OpenInBrowser()
}

