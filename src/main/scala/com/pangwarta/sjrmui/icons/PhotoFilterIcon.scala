package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object PhotoFilterIcon {

  @JSImport("material-ui-icons", "PhotoFilter")
  @js.native
  private object RawComponent extends js.Object
  private val PhotoFilter = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = PhotoFilter()
}

