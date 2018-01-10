package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object GifIcon {

  @JSImport("material-ui-icons", "Gif")
  @js.native
  private object RawComponent extends js.Object
  private val Gif = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Gif()
}

