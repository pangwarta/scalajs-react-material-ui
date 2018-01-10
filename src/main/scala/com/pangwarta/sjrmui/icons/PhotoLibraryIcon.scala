package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhotoLibraryIcon {

  @JSImport("material-ui-icons", "PhotoLibrary")
  @js.native
  private object RawComponent extends js.Object
  private val PhotoLibrary = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhotoLibrary()
}

