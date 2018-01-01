package example

import com.github.zachalbia.sjrmui.{ Button, Dialog, DialogActions, DialogContent, DialogContentText, DialogTitle }
import japgolly.scalajs.react.component.Scala.BackendScope
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.html_<^._
import japgolly.scalajs.react._

object AlertDialog {

  private class Backend(bs: BackendScope[Unit, Boolean]) {
    def render(open: Boolean): VdomElement =
      <.div(
        Button(onClick = (_: ReactMouseEvent) => handleClickOpen())()("Open alert dialog"),
        Dialog(
          open    = open,
          onClose = (_: ReactEvent) => handleClose()
        )(
          "aria-labelledby" -> "alert-dialog-title",
          "aria-describedby" -> "alert-dialog-description"
        )(
            DialogTitle()("id" -> "alert-dialog-title")("Use Google's location service?"),
            DialogContent()()(
              DialogContentText()()("Let Google help apps determine location. This means sending anonymous location data to Google, even when no apps are running.")
            ),
            DialogActions()()(
              Button(color   = Button.primary, onClick = (_: ReactMouseEvent) => handleClose())()("Agree"),
              Button(
                color   = Button.primary,
                onClick = (_: ReactMouseEvent) => handleClose()
              )(
                "autoFocus" -> "autoFocus"
              )("Disagree")
            )
          )
      )

    def handleClickOpen(): Callback =
      bs.setState(true)

    def handleClose(): Callback =
      bs.setState(false)
  }

  private val component = ScalaComponent.builder[Unit]("AlertDialog")
    .initialState(false)
    .renderBackend[Backend]
    .build

  def apply(): VdomElement = component()
}
