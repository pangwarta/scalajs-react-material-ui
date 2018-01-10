package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GamesIcon {

  @JSImport("material-ui-icons", "Games")
  @js.native
  private object RawComponent extends js.Object
  private val Games = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Games()
}

