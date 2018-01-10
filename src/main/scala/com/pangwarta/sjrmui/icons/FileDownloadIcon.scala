package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FileDownloadIcon {

  @JSImport("material-ui-icons", "FileDownload")
  @js.native
  private object RawComponent extends js.Object
  private val FileDownload = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FileDownload()
}

