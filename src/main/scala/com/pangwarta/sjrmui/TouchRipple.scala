package com.pangwarta.sjrmui

import scala.scalajs.js

object TouchRipple {

  @js.native
  trait Props extends js.Object {
    var center: js.UndefOr[Boolean]    = js.native
    var classes: js.Dictionary[String] = js.native
    var className: js.UndefOr[String]  = js.native
  }

  sealed abstract case class ClassKey(get: String) extends StringType
  object ClassKey {
    object root            extends ClassKey("root")
    object disabled        extends ClassKey("disabled")
    object keyboardFocused extends ClassKey("keyboardFocused")
  }
}
