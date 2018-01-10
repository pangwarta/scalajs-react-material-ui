package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ClosedCaptionIcon {

  @JSImport("material-ui-icons", "ClosedCaption")
  @js.native
  private object RawComponent extends js.Object
  private val ClosedCaption = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ClosedCaption()
}

