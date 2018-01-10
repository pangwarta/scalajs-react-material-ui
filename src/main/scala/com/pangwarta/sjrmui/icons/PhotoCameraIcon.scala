package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhotoCameraIcon {

  @JSImport("material-ui-icons", "PhotoCamera")
  @js.native
  private object RawComponent extends js.Object
  private val PhotoCamera = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhotoCamera()
}

