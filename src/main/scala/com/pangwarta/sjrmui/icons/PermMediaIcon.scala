package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PermMediaIcon {

  @JSImport("material-ui-icons", "PermMedia")
  @js.native
  private object RawComponent extends js.Object
  private val PermMedia = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PermMedia()
}

