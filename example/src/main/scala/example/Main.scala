package example

import org.scalajs.dom
import dom.document
import japgolly.scalajs.react.vdom.html_<^._
import com.github.zachalbia.sjrmui.Paper

object Main {

  def main(args: Array[String]): Unit = {
    val elem = Paper(classes = Map("root" -> "barbarbarbar"))("foo")
    elem.renderIntoDOM(document.getElementById("root"))
  }
}
