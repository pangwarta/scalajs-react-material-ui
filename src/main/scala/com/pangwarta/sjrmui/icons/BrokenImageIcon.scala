package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BrokenImageIcon {

  @JSImport("material-ui-icons", "BrokenImage")
  @js.native
  private object RawComponent extends js.Object
  private val BrokenImage = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BrokenImage()
}

