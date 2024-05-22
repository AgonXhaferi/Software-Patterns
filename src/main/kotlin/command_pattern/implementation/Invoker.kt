package main.kotlin.command_pattern.implementation

import main.kotlin.command_pattern.abstract_command.ICommand

class Invoker(
    private val iCommandOpen: ICommand,
) {

    fun clickOn() {
        this.iCommandOpen.execute()
    }

    fun clickOff() {
        this.iCommandOpen.unExecute()
    }
}