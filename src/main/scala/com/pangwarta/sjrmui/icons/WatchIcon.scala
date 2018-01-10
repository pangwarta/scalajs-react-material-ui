package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WatchIcon {

  @JSImport("material-ui-icons", "Watch")
  @js.native
  private object RawComponent extends js.Object
  private val Watch = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Watch()
}

