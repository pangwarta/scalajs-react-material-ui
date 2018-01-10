package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CreateNewFolderIcon {

  @JSImport("material-ui-icons", "CreateNewFolder")
  @js.native
  private object RawComponent extends js.Object
  private val CreateNewFolder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CreateNewFolder()
}

