package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PictureAsPdfIcon {

  @JSImport("material-ui-icons", "PictureAsPdf")
  @js.native
  private object RawComponent extends js.Object
  private val PictureAsPdf = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PictureAsPdf()
}

