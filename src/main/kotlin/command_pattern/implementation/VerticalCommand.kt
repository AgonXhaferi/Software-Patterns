package main.kotlin.command_pattern.implementation

import main.kotlin.command_pattern.abstract_command.ICommand

class VerticalCommand(private val receiver: DoorReceiver) : ICommand {
    override fun execute() {
        this.receiver.openVertically()
    }

    override fun unExecute() {
        this.receiver.closeVertically()
    }
}