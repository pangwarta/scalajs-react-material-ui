package com.pangwarta.sjrmui

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object Colors {

  sealed abstract case class Name(get: String) extends StringType
  object red extends Name("red")
  object pink extends Name("pink")
  object purple extends Name("purple")
  object deepPurple extends Name("deepPurple")
  object indigo extends Name("indigo")
  object blue extends Name("blue")
  object lightBlue extends Name("lightBlue")
  object cyan extends Name("cyan")
  object teal extends Name("teal")
  object green extends Name("green")
  object lightGreen extends Name("lightGreen")
  object lime extends Name("lime")
  object yellow extends Name("yellow")
  object amber extends Name("amber")
  object orange extends Name("orange")
  object deepOrange extends Name("deepOrange")
  object brown extends Name("brown")
  object grey extends Name("grey")
  object blueGrey extends Name("blueGrey")

  sealed abstract case class Value(get: String) extends StringType
  object _50 extends Value("50")
  object _100 extends Value("100")
  object _200 extends Value("200")
  object _300 extends Value("300")
  object _400 extends Value("400")
  object _500 extends Value("500")
  object _600 extends Value("600")
  object _700 extends Value("700")
  object _800 extends Value("800")
  object _900 extends Value("900")
  object _A100 extends Value("A100")
  object _A200 extends Value("A200")
  object _A400 extends Value("A400")
  object _A700 extends Value("A700")

  sealed abstract case class Key(get: String) extends StringType
  object black extends Key("black")
  object white extends Key("white")
  object transparent extends Key("transparent")
  object fullBlack extends Key("fullBlack")
  object darkBlack extends Key("darkBlack")
  object lightBlack extends Key("lightBlack")
  object minBlack extends Key("minBlack")
  object faintBlack extends Key("faintBlack")
  object fullWhite extends Key("fullWhite")
  object darkWhite extends Key("darkWhite")
  object lightWhite extends Key("lightWhite")

  @JSImport("material-ui", JSImport.Namespace)
  @js.native
  private object RawColors extends js.Object {
    val colors: js.Dictionary[js.Dictionary[String]] = js.native
  }

  def apply(name: Name, value: Value): String =
    RawColors.colors(name.get)(value.get)

  def common(key: Key): String =
    RawColors.colors("common")(key.get)
}
