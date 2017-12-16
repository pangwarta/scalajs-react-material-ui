package example

import com.github.zachalbia.sjrmui.Typography.Type
import com.github.zachalbia.sjrmui._
import example.CssSettings._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom

import scala.scalajs.js.Any._

object Main {
  val avatarCls = "ExampleStyles-avatar"
  val badgeCls = "ExampleStyles-badge"
  val marginCls = "ExampleStyles-margin"

  def main(args: Array[String]): Unit = {
    val elem =
      <.div(
        AppBar(
          color    = AppBar.primary,
          position = AppBar.fixed,
          square   = true)(
          Typography(
            color  = Typography.Color.secondary,
            `type` = Type.headline)("Foo")),
        <.div(
          ^.cls := marginCls,
          Grid(container = true)(
            Grid(item = true, lg = 6)(
              Avatar(
                classes = Map(Avatar.root -> avatarCls),
                src     = "https://i.redd.it/pjnmzubsrt201.jpg")(),
              Badge(
                badgeContent = <.span(^.fontStyle.italic, "Meow!").rawElement,
                color        = Badge.Color.primary,
                classes      = Map(Badge.root -> avatarCls, Badge.badge -> badgeCls))(
                  <.img(^.src := "https://i.redd.it/pjnmzubsrt201.jpg", ^.cls := avatarCls)),
              Typography(`type` = Type.body1)(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque mollis quis urna ac lacinia. Curabitur euismod erat eu ligula porttitor vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut sed est sit amet ligula placerat faucibus ac id felis. Aliquam ut condimentum nunc. Nam nec accumsan felis, a dapibus mi. Vestibulum urna felis, commodo nec nunc fermentum, convallis fermentum ex. Quisque lobortis orci id dui posuere vehicula. Vivamus semper ipsum in dictum consectetur.\n\nPellentesque faucibus enim interdum justo volutpat lobortis. Curabitur consectetur massa eget vehicula consectetur. Quisque volutpat leo lorem, nec sodales nibh suscipit non. Ut vitae arcu laoreet ipsum aliquam finibus et nec erat. Pellentesque tincidunt quis leo ultrices feugiat. Vivamus sit amet posuere massa. Etiam sollicitudin rutrum neque sit amet placerat. Morbi sit amet lobortis ante. Sed augue ipsum, malesuada a risus eget, eleifend venenatis quam. Proin eros nulla, consequat ac pellentesque nec, dapibus vitae nisl.")))),
        BottomNavigation[Int](
          showLabels = true)(
          BottomNavigationButton(value   = 0, icon = "eject", label = "Foo",
                                 onClick = (_: ReactMouseEvent) => Callback { dom.console.log("foo") })(),
          BottomNavigationButton(value = 1, icon = "face", label = "Bar")()))
    elem.renderIntoDOM(dom.document.getElementById("root"))
    ExampleStyles.addToDocument()
  }
}
