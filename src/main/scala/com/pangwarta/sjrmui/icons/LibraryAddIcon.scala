package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LibraryAddIcon {

  @JSImport("material-ui-icons", "LibraryAdd")
  @js.native
  private object RawComponent extends js.Object
  private val LibraryAdd = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LibraryAdd()
}

