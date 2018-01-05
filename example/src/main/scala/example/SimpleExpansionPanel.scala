package example

import com.pangwarta.sjrmui.{ ExpansionPanel, ExpansionPanelDetails, ExpansionPanelSummary, Typography }
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._
import ExampleStyles._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scalacss.ScalaCssReact._

object SimpleExpansionPanel {

  @JSImport("material-ui-icons", "ExpandMore")
  @js.native
  private object ExpandMoreRawComponent extends js.Object
  private val ExpandMoreIcon = JsComponent[Null, Children.None, Null](ExpandMoreRawComponent)

  private val component = ScalaComponent.builder[Unit]("SimpleExpansionPanel")
    .renderStatic(
      <.div(
        ExampleStyles.SimpleExpansionPanel.root,
        ExpansionPanel(defaultExpanded = true)()(
          ExpansionPanelSummary(expandIcon = ExpandMoreIcon().rawElement)()(
            Typography(className = ExampleStyles.SimpleExpansionPanel.heading)()("Expansion Panel 1")
          ),
          ExpansionPanelDetails()()(
            Typography()()(
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
            )
          )
        ),
        ExpansionPanel()()(
          ExpansionPanelSummary(expandIcon = ExpandMoreIcon().rawElement)()(
            Typography(className = ExampleStyles.SimpleExpansionPanel.heading)()(
              "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Suspendisse malesuada lacus ex, sit amet blandit leo lobortis eget."
            )
          )
        ),
        ExpansionPanel(disabled = true)()(
          ExpansionPanelSummary(expandIcon = ExpandMoreIcon().rawElement)()(
            Typography(className = ExampleStyles.SimpleExpansionPanel.heading)()("Disabled Expansion Panel")
          )
        )
      )
    ).build

  def apply() = component()
}
