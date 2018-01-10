package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MoreVertIcon {

  @JSImport("material-ui-icons", "MoreVert")
  @js.native
  private object RawComponent extends js.Object
  private val MoreVert = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = MoreVert()
}

