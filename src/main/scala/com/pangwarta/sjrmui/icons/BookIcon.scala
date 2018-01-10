package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BookIcon {

  @JSImport("material-ui-icons", "Book")
  @js.native
  private object RawComponent extends js.Object
  private val Book = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Book()
}

