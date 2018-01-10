package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FontDownloadIcon {

  @JSImport("material-ui-icons", "FontDownload")
  @js.native
  private object RawComponent extends js.Object
  private val FontDownload = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FontDownload()
}

