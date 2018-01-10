package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EnhancedEncryptionIcon {

  @JSImport("material-ui-icons", "EnhancedEncryption")
  @js.native
  private object RawComponent extends js.Object
  private val EnhancedEncryption = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = EnhancedEncryption()
}

