package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ArtTrackIcon {

  @JSImport("material-ui-icons", "ArtTrack")
  @js.native
  private object RawComponent extends js.Object
  private val ArtTrack = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ArtTrack()
}

