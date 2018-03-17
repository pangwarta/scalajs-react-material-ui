package example

import com.pangwarta.sjrmui.Typography.Variant
import com.pangwarta.sjrmui.{ AppBar, Typography }
import japgolly.scalajs.react.ScalaComponent
import japgolly.scalajs.react.vdom.html_<^._

object ExampleAppBar {

  private val component = ScalaComponent.builder[Unit]("ExampleAppBar")
    .renderStatic(
      AppBar(
        color    = AppBar.primary,
        position = AppBar.fixed,
        square   = true
      )()(
        Typography(
          color   = Typography.Color.secondary,
          variant = Variant.headline
        )()("Foo")
      ).vdomElement
    ).build

  def apply() = component()
}
