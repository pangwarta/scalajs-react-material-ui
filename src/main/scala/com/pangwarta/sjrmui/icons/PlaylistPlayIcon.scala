package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PlaylistPlayIcon {

  @JSImport("material-ui-icons", "PlaylistPlay")
  @js.native
  private object RawComponent extends js.Object
  private val PlaylistPlay = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PlaylistPlay()
}

