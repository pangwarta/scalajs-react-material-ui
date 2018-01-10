package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object NatureIcon {

  @JSImport("material-ui-icons", "Nature")
  @js.native
  private object RawComponent extends js.Object
  private val Nature = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Nature()
}

