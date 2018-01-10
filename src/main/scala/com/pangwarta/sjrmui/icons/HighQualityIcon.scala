package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HighQualityIcon {

  @JSImport("material-ui-icons", "HighQuality")
  @js.native
  private object RawComponent extends js.Object
  private val HighQuality = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HighQuality()
}

