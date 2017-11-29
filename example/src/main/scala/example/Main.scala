package example

import com.github.zachalbia.sjrmui.AppBar
import com.github.zachalbia.sjrmui.AppBar.root
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.document

object Main {

  def main(args: Array[String]): Unit = {
    val elem = AppBar(classes = Map(root -> "baz"))(<.div("foo"))
    elem.renderIntoDOM(document.getElementById("root"))
  }
}
