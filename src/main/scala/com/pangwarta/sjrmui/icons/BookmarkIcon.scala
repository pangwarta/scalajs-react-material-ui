package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BookmarkIcon {

  @JSImport("material-ui-icons", "Bookmark")
  @js.native
  private object RawComponent extends js.Object
  private val Bookmark = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Bookmark()
}

