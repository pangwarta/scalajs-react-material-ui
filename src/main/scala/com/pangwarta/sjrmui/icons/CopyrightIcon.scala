package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CopyrightIcon {

  @JSImport("material-ui-icons", "Copyright")
  @js.native
  private object RawComponent extends js.Object
  private val Copyright = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Copyright()
}

