package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object StarsIcon {

  @JSImport("material-ui-icons", "Stars")
  @js.native
  private object RawComponent extends js.Object
  private val Stars = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Stars()
}

