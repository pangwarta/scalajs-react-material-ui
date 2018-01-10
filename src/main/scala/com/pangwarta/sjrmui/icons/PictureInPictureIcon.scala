package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PictureInPictureIcon {

  @JSImport("material-ui-icons", "PictureInPicture")
  @js.native
  private object RawComponent extends js.Object
  private val PictureInPicture = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PictureInPicture()
}

