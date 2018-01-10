package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RssFeedIcon {

  @JSImport("material-ui-icons", "RssFeed")
  @js.native
  private object RawComponent extends js.Object
  private val RssFeed = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RssFeed()
}

