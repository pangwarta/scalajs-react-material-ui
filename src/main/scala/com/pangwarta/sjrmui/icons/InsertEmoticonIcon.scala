package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object InsertEmoticonIcon {

  @JSImport("material-ui-icons", "InsertEmoticon")
  @js.native
  private object RawComponent extends js.Object
  private val InsertEmoticon = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = InsertEmoticon()
}

