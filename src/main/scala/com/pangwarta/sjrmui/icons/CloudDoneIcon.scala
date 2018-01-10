package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object CloudDoneIcon {

  @JSImport("material-ui-icons", "CloudDone")
  @js.native
  private object RawComponent extends js.Object
  private val CloudDone = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = CloudDone()
}

