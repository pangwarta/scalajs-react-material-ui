package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object VideoLabelIcon {

  @JSImport("material-ui-icons", "VideoLabel")
  @js.native
  private object RawComponent extends js.Object
  private val VideoLabel = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = VideoLabel()
}

