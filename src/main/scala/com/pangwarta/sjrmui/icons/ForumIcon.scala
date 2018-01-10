package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ForumIcon {

  @JSImport("material-ui-icons", "Forum")
  @js.native
  private object RawComponent extends js.Object
  private val Forum = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Forum()
}

