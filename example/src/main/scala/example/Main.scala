package example

import com.github.zachalbia.sjrmui.Typography.Type
import com.github.zachalbia.sjrmui._
import example.CssSettings._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom
import ExampleStyles._
import scalacss.ScalaCssReact._

import scala.language.implicitConversions

object Main {
  val catPicUrl = "https://i.redd.it/pjnmzubsrt201.jpg"

  def main(args: Array[String]): Unit = {
    val app =
      <.div(
        AppBar(
          color    = AppBar.primary,
          position = AppBar.fixed,
          square   = true
        )()(
          Typography(
            color  = Typography.Color.secondary,
            `type` = Type.headline
          )()("Foo")
        ),
        <.div(
          ExampleStyles.margin,
          Grid(container = true)()(
            Grid(item = true, md = 6, sm = 12, xs = 12)()(
              Avatar(
                classes = Map(Avatar.root -> ExampleStyles.avatar),
                src     = catPicUrl
              )()(),
              Badge(
                badgeContent = <.span(^.fontStyle.italic, "Meow!").rawElement,
                color        = Badge.Color.primary,
                classes      = Map(Badge.root -> ExampleStyles.avatar, Badge.badge -> ExampleStyles.badge)
              )()(
                  <.img(^.src := catPicUrl, ExampleStyles.avatar)
                ),
              Typography(`type` = Type.body1)()(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque mollis quis urna ac lacinia. Curabitur euismod erat eu ligula porttitor vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut sed est sit amet ligula placerat faucibus ac id felis. Aliquam ut condimentum nunc. Nam nec accumsan felis, a dapibus mi. Vestibulum urna felis, commodo nec nunc fermentum, convallis fermentum ex. Quisque lobortis orci id dui posuere vehicula. Vivamus semper ipsum in dictum consectetur."
              ),
              Paper(
                classes = Map(
                  Paper.root -> Seq(ExampleStyles.paper, ExampleStyles.paperExample),
                  Paper.shadow2 -> ExampleStyles.paperShadow2
                )
              )("foo" -> "bar")(
                  Typography(component = "p", `type` = Type.body1)()(
                    "The quick brown fox jumps over the lazy dog."
                  ),
                  AlertDialog(),
                  Checkbox(value = "Check me")(),
                  Chip(avatar = Avatar()()("ZA"))()
                ),
              Card(className = Seq(ExampleStyles.paper, ExampleStyles.card))()(
                CardHeader(
                  avatar = Avatar(className = ExampleStyles.cardAvatar.className.value)()("ZA").rawElement,
                  title  = <.span("Merry Christmas").rawElement
                )(),
                CardActions()()()
              )
            )
          )
        ),
        SimpleBottomNav()
      )
    app.renderIntoDOM(dom.document.getElementById("root"))
    ExampleStyles.addToDocument()
  }
}
