package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SkipNextIcon {

  @JSImport("material-ui-icons", "SkipNext")
  @js.native
  private object RawComponent extends js.Object
  private val SkipNext = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SkipNext()
}

