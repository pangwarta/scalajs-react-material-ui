package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object LibraryMusicIcon {

  @JSImport("material-ui-icons", "LibraryMusic")
  @js.native
  private object RawComponent extends js.Object
  private val LibraryMusic = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = LibraryMusic()
}

