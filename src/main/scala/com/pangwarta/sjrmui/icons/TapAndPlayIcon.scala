package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object TapAndPlayIcon {

  @JSImport("material-ui-icons", "TapAndPlay")
  @js.native
  private object RawComponent extends js.Object
  private val TapAndPlay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = TapAndPlay()
}

