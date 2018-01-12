package example

import com.pangwarta.sjrmui.{ BottomNavigation, BottomNavigationAction }
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Scala.BackendScope
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom.window.console

object SimpleBottomNav {

  private class Backend(bs: BackendScope[Unit, Int]) {
    def render(s: Int): VdomElement =
      BottomNavigation[Int](
        showLabels = true,
        value      = s,
        onChange   = (_: ReactEvent, value: Int) => changeValue(value)
      )()(
        BottomNavigationAction(value = 0, icon = "star", label = "Foo")()(),
        BottomNavigationAction(value = 1, icon = "star_border", label = "Bar")()(),
        BottomNavigationAction(value = 2, icon = "star_half", label = "Baz")()()
      )

    def changeValue(value: Int): Callback =
      bs.setState(value) >> Callback { console.log(s"Changed to button $value") }
  }

  private val component = ScalaComponent.builder[Unit]("SimpleBottomNav")
    .initialState(0)
    .renderBackend[Backend]
    .build

  def apply(): VdomElement = component()
}
