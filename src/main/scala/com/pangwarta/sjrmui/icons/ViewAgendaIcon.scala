package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object ViewAgendaIcon {

  @JSImport("material-ui-icons", "ViewAgenda")
  @js.native
  private object RawComponent extends js.Object
  private val ViewAgenda = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = ViewAgenda()
}

