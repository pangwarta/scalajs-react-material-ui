package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object BookmarkBorderIcon {

  @JSImport("material-ui-icons", "BookmarkBorder")
  @js.native
  private object RawComponent extends js.Object
  private val BookmarkBorder = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = BookmarkBorder()
}

