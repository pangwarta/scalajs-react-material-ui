package example

import com.pangwarta.sjrmui.Typography.Variant
import com.pangwarta.sjrmui.{ Avatar, Badge, Typography }
import example.ExampleStyles._
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

import scalacss.ScalaCssReact._

object TopSection {

  private val catPicUrl = "https://i.redd.it/pjnmzubsrt201.jpg"

  private val component = ScalaComponent.builder[Unit]("TopSection")
    .renderStatic(
      <.div(
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
        Typography(variant = Variant.body1)()(
          "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Quisque mollis quis urna ac lacinia. Curabitur euismod erat eu ligula porttitor vestibulum. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Ut sed est sit amet ligula placerat faucibus ac id felis. Aliquam ut condimentum nunc. Nam nec accumsan felis, a dapibus mi. Vestibulum urna felis, commodo nec nunc fermentum, convallis fermentum ex. Quisque lobortis orci id dui posuere vehicula. Vivamus semper ipsum in dictum consectetur."
        )
      )
    ).build

  def apply() = component()
}
