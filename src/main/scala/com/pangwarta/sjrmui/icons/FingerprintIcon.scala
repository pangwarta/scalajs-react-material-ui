package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object FingerprintIcon {

  @JSImport("material-ui-icons", "Fingerprint")
  @js.native
  private object RawComponent extends js.Object
  private val Fingerprint = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Fingerprint()
}

