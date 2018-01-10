package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PlayCircleFilledIcon {

  @JSImport("material-ui-icons", "PlayCircleFilled")
  @js.native
  private object RawComponent extends js.Object
  private val PlayCircleFilled = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PlayCircleFilled()
}

