package example

import com.github.zachalbia.sjrmui.Typography.Type
import com.github.zachalbia.sjrmui._
import example.CssSettings._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import org.scalajs.dom

object Main {
  val avatarCls = "ExampleStyles-avatar"
  val badgeCls = "ExampleStyles-badge"
  val marginCls = "ExampleStyles-margin"
  val paper = "ExampleStyles-paper"
  val paperShadow2 = "ExampleStyles-paperShadow2"
  val catPicUrl = "https://i.redd.it/pjnmzubsrt201.jpg"

  def main(args: Array[String]): Unit = {
    val app =
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
            Grid(item = true, md = 6)(
              Avatar(
                classes = Map(Avatar.root -> avatarCls),
                src     = catPicUrl)(),
              Badge(
                badgeContent = <.span(^.fontStyle.italic, "Meow!").rawElement,
                color        = Badge.Color.primary,
                classes      = Map(Badge.root -> avatarCls, Badge.badge -> badgeCls))(
                  <.img(^.src := catPicUrl, ^.cls := avatarCls)),
              Typography(`type` = Type.body1)(
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque mollis quis urna ac lacinia. Curabitur euismod erat eu ligula porttitor vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut sed est sit amet ligula placerat faucibus ac id felis. Aliquam ut condimentum nunc. Nam nec accumsan felis, a dapibus mi. Vestibulum urna felis, commodo nec nunc fermentum, convallis fermentum ex. Quisque lobortis orci id dui posuere vehicula. Vivamus semper ipsum in dictum consectetur."),
              Paper(classes = Map(Paper.root -> paper, Paper.shadow2 -> paperShadow2))(
                Typography(component = "p", `type` = Type.body1)(
                  "The quick brown fox jumps over the lazy dog."),
                Button(color  = Button.primary, raised = true)("Do it"))))),
        SimpleBottomNav())
    app.renderIntoDOM(dom.document.getElementById("root"))
    ExampleStyles.addToDocument()
  }
}
