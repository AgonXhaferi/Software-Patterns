package main.kotlin.adapter_pattern.implementation

import main.kotlin.adapter_pattern.abstract_pattern.Target

class Adapter(private val adaptee: Adaptee) : Target {
    override fun request() {
        this.adaptee.specificRequest()
    }
}