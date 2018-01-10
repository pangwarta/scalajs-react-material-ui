package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HdrStrongIcon {

  @JSImport("material-ui-icons", "HdrStrong")
  @js.native
  private object RawComponent extends js.Object
  private val HdrStrong = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HdrStrong()
}

