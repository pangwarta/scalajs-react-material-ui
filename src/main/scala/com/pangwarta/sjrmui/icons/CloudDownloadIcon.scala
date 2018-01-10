package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloudDownloadIcon {

  @JSImport("material-ui-icons", "CloudDownload")
  @js.native
  private object RawComponent extends js.Object
  private val CloudDownload = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CloudDownload()
}

