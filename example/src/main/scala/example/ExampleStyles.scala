package example

import com.pangwarta.sjrmui.Colors

import scala.language.implicitConversions
import scala.scalajs.js
import scalacss.DevDefaults._

object ExampleStyles extends StyleSheet.Inline {
  import dsl._

  val avatar = style(
    width(128.px),
    height(128.px)
  )

  val badge = style(
    width(48.px),
    height(48.px)
  )

  val card = style(
    maxWidth(400.px)
  )

  val cardAvatar = style(
    backgroundColor(Color(Colors(Colors.red, Colors._500)))
  )

  val margin = style(
    marginTop(80.px),
    marginLeft(24.px),
    marginRight(24.px)
  )

  val paper = style(
    marginTop(16.px),
    marginBottom(16.px)
  )

  val paperExample = style(
    padding(8.px)
  )

  val paperShadow2 = style(
    boxShadow :=
      "0px 1px 5px 0px rgba(255, 0, 0, 0.2), " +
      "0px 2px 2px 0px rgba(255, 0, 0, 0.14), " +
      "0px 3px 1px -2px rgba(255, 0, 0, 0.12)"
  )

  object SimpleExpansionPanel {
    val root = style(
      width(100.%%)
    )

    val heading = style(
      fontSize(1.rem),
      fontWeight.normal
    )
  }

  val modalStyle: StyleA = {
      def rand() = Math.floor(Math.random() * 20) - 10

    val topPosn = 50 + rand()
    val leftPosn = 50 + rand()

    style(
      position.absolute,
      width((8 * 50).px),
      top(topPosn.%%),
      left(leftPosn.%%),
      transform := s"translate(-$topPosn%, -$leftPosn%)",
      border(1.px, solid, c"#e5e5e5"),
      backgroundColor(c"#fff"),
      boxShadow := "0 5px 15px rgba(0, 0, 0, .5)",
      padding((8 * 4).px)
    )
  }

  implicit def styleAToClassName(styleA: StyleA): String =
    styleA.className.value

  implicit def styleAToUndefOrClassName(styleA: StyleA): js.UndefOr[String] =
    js.UndefOr.any2undefOrA(styleA.className.value)

  implicit def stylesToClassName(styleAs: Seq[StyleA]): String =
    styleAs.map(styleAToClassName).mkString(" ")

  implicit def stylesToUndefOrClassName(styleAs: Seq[StyleA]): js.UndefOr[String] =
    stylesToClassName(styleAs)
}
