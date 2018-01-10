package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SdCardIcon {

  @JSImport("material-ui-icons", "SdCard")
  @js.native
  private object RawComponent extends js.Object
  private val SdCard = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SdCard()
}

