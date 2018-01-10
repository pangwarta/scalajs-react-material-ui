package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object EventIcon {

  @JSImport("material-ui-icons", "Event")
  @js.native
  private object RawComponent extends js.Object
  private val Event = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Event()
}

