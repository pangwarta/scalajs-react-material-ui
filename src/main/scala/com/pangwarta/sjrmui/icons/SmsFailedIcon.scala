package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SmsFailedIcon {

  @JSImport("material-ui-icons", "SmsFailed")
  @js.native
  private object RawComponent extends js.Object
  private val SmsFailed = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = SmsFailed()
}

