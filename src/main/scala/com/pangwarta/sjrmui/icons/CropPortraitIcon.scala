package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CropPortraitIcon {

  @JSImport("material-ui-icons", "CropPortrait")
  @js.native
  private object RawComponent extends js.Object
  private val CropPortrait = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CropPortrait()
}

