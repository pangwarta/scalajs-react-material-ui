package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MonochromePhotosIcon {

  @JSImport("material-ui-icons", "MonochromePhotos")
  @js.native
  private object RawComponent extends js.Object
  private val MonochromePhotos = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MonochromePhotos()
}

