package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BrandingWatermarkIcon {

  @JSImport("material-ui-icons", "BrandingWatermark")
  @js.native
  private object RawComponent extends js.Object
  private val BrandingWatermark = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BrandingWatermark()
}

