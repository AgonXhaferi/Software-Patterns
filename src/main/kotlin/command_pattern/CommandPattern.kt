package main.kotlin.command_pattern

import main.kotlin.command_pattern.implementation.DoorReceiver
import main.kotlin.command_pattern.implementation.HorizontalCommand
import main.kotlin.command_pattern.implementation.VerticalCommand

fun main() {
    val doorReceiver = DoorReceiver()
    val doorReceiver2 = DoorReceiver()

    val horizontalCommand = HorizontalCommand(doorReceiver)
    val verticalCommand = VerticalCommand(doorReceiver2)

    horizontalCommand.execute()
    verticalCommand.execute()

    verticalCommand.unExecute()
}