package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object DescriptionIcon {

  @JSImport("material-ui-icons", "Description")
  @js.native
  private object RawComponent extends js.Object
  private val Description = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Description()
}

