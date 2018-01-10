package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GroupAddIcon {

  @JSImport("material-ui-icons", "GroupAdd")
  @js.native
  private object RawComponent extends js.Object
  private val GroupAdd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = GroupAdd()
}

