package example

import com.pangwarta.sjrmui.{ Button, Modal, Typography }
import japgolly.scalajs.react._
import japgolly.scalajs.react.component.Scala.BackendScope
import japgolly.scalajs.react.vdom.html_<^._

import scalacss.ScalaCssReact._

// TODO: Fix issue with Modal removing scrollbar and output when in small/medium viewport
object SimpleModal {

  private class Backend(bs: BackendScope[Unit, Boolean]) {
    def render(open: Boolean): VdomElement =
      <.div(
        Typography(gutterBottom = true)()("Click to see a Modal"),
        Button(onClick = (_: ReactMouseEvent) => handleOpen())()("Open Modal"),
        Modal(open    = open, onClose = (_: ReactEventFromHtml, _: String) => handleClose())(
          "aria-labelledby" -> "simple-modal-title",
          "aria-describedby" -> "simple-modal-description"
        )(
            <.div(
              ExampleStyles.modalStyle(),
              Typography(variant = Typography.Variant.title)("id" -> "modal-title")(
                "Text in a modal"
              ),
              Typography(variant = Typography.Variant.subheading)("id" -> "simple-modal-description")(
                "Duis mollis, est non commodo luctus, nisi erat porttitor ligula."
              )
            )
          )
      )

    def handleOpen(): Callback =
      bs.setState(true)

    def handleClose(): Callback =
      bs.setState(false)
  }

  private val component = ScalaComponent.builder[Unit]("SimpleModal")
    .initialState(false)
    .renderBackend[Backend]
    .build

  def apply(): VdomElement = component()
}
