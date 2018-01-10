package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FolderSpecialIcon {

  @JSImport("material-ui-icons", "FolderSpecial")
  @js.native
  private object RawComponent extends js.Object
  private val FolderSpecial = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = FolderSpecial()
}

