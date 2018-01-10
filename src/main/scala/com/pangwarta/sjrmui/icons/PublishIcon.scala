package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PublishIcon {

  @JSImport("material-ui-icons", "Publish")
  @js.native
  private object RawComponent extends js.Object
  private val Publish = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Publish()
}

