package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CropIcon {

  @JSImport("material-ui-icons", "Crop")
  @js.native
  private object RawComponent extends js.Object
  private val Crop = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Crop()
}

