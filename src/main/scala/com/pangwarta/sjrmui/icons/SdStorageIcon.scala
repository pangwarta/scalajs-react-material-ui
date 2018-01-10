package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SdStorageIcon {

  @JSImport("material-ui-icons", "SdStorage")
  @js.native
  private object RawComponent extends js.Object
  private val SdStorage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SdStorage()
}

