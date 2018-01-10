package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ExtensionIcon {

  @JSImport("material-ui-icons", "Extension")
  @js.native
  private object RawComponent extends js.Object
  private val Extension = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Extension()
}

