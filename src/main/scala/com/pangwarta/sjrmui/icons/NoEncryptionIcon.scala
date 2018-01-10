package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NoEncryptionIcon {

  @JSImport("material-ui-icons", "NoEncryption")
  @js.native
  private object RawComponent extends js.Object
  private val NoEncryption = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = NoEncryption()
}

