package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LiveTvIcon {

  @JSImport("material-ui-icons", "LiveTv")
  @js.native
  private object RawComponent extends js.Object
  private val LiveTv = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LiveTv()
}

