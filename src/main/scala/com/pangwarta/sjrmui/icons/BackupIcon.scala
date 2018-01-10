package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BackupIcon {

  @JSImport("material-ui-icons", "Backup")
  @js.native
  private object RawComponent extends js.Object
  private val Backup = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Backup()
}

