package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object RecentActorsIcon {

  @JSImport("material-ui-icons", "RecentActors")
  @js.native
  private object RawComponent extends js.Object
  private val RecentActors = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = RecentActors()
}

