package com.pangwarta.sjrmui.icons

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import japgolly.scalajs.react._

object AttachmentIcon {

  @JSImport("material-ui-icons", "Attachment")
  @js.native
  private object RawComponent extends js.Object
  private val Attachment = JsComponent[Null, Children.None, Null](RawComponent)

  def apply() = Attachment()
}

