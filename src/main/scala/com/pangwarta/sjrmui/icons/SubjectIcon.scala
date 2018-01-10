package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object SubjectIcon {

  @JSImport("material-ui-icons", "Subject")
  @js.native
  private object RawComponent extends js.Object
  private val Subject = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Subject()
}

