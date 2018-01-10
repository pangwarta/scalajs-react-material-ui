package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArchiveIcon {

  @JSImport("material-ui-icons", "Archive")
  @js.native
  private object RawComponent extends js.Object
  private val Archive = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Archive()
}

