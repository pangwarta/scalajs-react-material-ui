package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ImageIcon {

  @JSImport("material-ui-icons", "Image")
  @js.native
  private object RawComponent extends js.Object
  private val Image = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Image()
}

