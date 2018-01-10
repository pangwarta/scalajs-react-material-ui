package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object HdrWeakIcon {

  @JSImport("material-ui-icons", "HdrWeak")
  @js.native
  private object RawComponent extends js.Object
  private val HdrWeak = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = HdrWeak()
}

