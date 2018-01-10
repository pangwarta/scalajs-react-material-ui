package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object MovieIcon {

  @JSImport("material-ui-icons", "Movie")
  @js.native
  private object RawComponent extends js.Object
  private val Movie = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Movie()
}

