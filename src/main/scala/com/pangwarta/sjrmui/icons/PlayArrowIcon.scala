package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PlayArrowIcon {

  @JSImport("material-ui-icons", "PlayArrow")
  @js.native
  private object RawComponent extends js.Object
  private val PlayArrow = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PlayArrow()
}

