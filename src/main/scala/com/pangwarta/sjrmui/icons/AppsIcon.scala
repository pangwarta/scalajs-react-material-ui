package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AppsIcon {

  @JSImport("material-ui-icons", "Apps")
  @js.native
  private object RawComponent extends js.Object
  private val Apps = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Apps()
}

