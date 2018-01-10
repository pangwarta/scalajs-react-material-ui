package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WallpaperIcon {

  @JSImport("material-ui-icons", "Wallpaper")
  @js.native
  private object RawComponent extends js.Object
  private val Wallpaper = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Wallpaper()
}

