package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloudUploadIcon {

  @JSImport("material-ui-icons", "CloudUpload")
  @js.native
  private object RawComponent extends js.Object
  private val CloudUpload = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CloudUpload()
}

