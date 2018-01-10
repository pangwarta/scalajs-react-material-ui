package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GroupIcon {

  @JSImport("material-ui-icons", "Group")
  @js.native
  private object RawComponent extends js.Object
  private val Group = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Group()
}

