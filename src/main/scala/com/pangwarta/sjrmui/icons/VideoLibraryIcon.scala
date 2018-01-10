package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VideoLibraryIcon {

  @JSImport("material-ui-icons", "VideoLibrary")
  @js.native
  private object RawComponent extends js.Object
  private val VideoLibrary = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VideoLibrary()
}

