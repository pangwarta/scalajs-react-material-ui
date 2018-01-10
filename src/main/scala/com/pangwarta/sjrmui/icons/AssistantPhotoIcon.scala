package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AssistantPhotoIcon {

  @JSImport("material-ui-icons", "AssistantPhoto")
  @js.native
  private object RawComponent extends js.Object
  private val AssistantPhoto = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = AssistantPhoto()
}

