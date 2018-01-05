package com.pangwarta.sjrmui.styles

import com.pangwarta.sjrmui.StringType

sealed abstract case class Breakpoint(get: String) extends StringType

object Breakpoint {
  object xs extends Breakpoint("xs")
  object sm extends Breakpoint("sm")
  object md extends Breakpoint("md")
  object lg extends Breakpoint("lg")
  object xl extends Breakpoint("xl")
}
