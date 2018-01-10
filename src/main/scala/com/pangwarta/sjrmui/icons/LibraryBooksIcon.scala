package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LibraryBooksIcon {

  @JSImport("material-ui-icons", "LibraryBooks")
  @js.native
  private object RawComponent extends js.Object
  private val LibraryBooks = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LibraryBooks()
}

