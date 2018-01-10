package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewModuleIcon {

  @JSImport("material-ui-icons", "ViewModule")
  @js.native
  private object RawComponent extends js.Object
  private val ViewModule = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewModule()
}

