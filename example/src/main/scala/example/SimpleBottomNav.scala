package example

import com.github.zachalbia.sjrmui.{ BottomNavigation, BottomNavigationButton }
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
        onChange   = (_: ReactEvent, value: Int) => changeValue(value))(
        BottomNavigationButton(value = 0, icon = "eject", label = "Foo")()(),
        BottomNavigationButton(value = 1, icon = "face", label = "Bar")()())

    def changeValue(value: Int): Callback =
      bs.setState(value) >> Callback { console.log(s"Changed to button $value") }
  }

  private val component = ScalaComponent.builder[Unit]("SimpleBottomNav")
    .initialState(0)
    .renderBackend[Backend]
    .build

  def apply(): VdomElement = component()
}
