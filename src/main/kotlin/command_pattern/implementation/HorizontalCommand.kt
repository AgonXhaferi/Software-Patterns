package main.kotlin.command_pattern.implementation

import main.kotlin.command_pattern.abstract_command.ICommand

class HorizontalCommand(private val receiver: DoorReceiver) : ICommand {
    override fun execute() {
        receiver.openHorizontally()
    }

    override fun unExecute() {
        receiver.closeHorizontally()
    }
}