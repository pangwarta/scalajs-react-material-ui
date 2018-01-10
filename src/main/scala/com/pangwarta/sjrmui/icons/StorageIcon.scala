package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StorageIcon {

  @JSImport("material-ui-icons", "Storage")
  @js.native
  private object RawComponent extends js.Object
  private val Storage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Storage()
}

