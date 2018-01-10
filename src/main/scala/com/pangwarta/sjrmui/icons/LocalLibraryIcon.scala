package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LocalLibraryIcon {

  @JSImport("material-ui-icons", "LocalLibrary")
  @js.native
  private object RawComponent extends js.Object
  private val LocalLibrary = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LocalLibrary()
}

