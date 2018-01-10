package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AnnouncementIcon {

  @JSImport("material-ui-icons", "Announcement")
  @js.native
  private object RawComponent extends js.Object
  private val Announcement = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Announcement()
}

