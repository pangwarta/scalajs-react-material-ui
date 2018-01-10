package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object indexIcon {

  @JSImport("material-ui-icons", "index")
  @js.native
  private object RawComponent extends js.Object
  private val index = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = index()
}

