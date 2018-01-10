package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object WorkIcon {

  @JSImport("material-ui-icons", "Work")
  @js.native
  private object RawComponent extends js.Object
  private val Work = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Work()
}

