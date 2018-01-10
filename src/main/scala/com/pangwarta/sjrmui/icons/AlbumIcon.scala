package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AlbumIcon {

  @JSImport("material-ui-icons", "Album")
  @js.native
  private object RawComponent extends js.Object
  private val Album = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Album()
}

