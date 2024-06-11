package main.kotlin.adapter_pattern

import main.kotlin.adapter_pattern.abstract_pattern.Target
import main.kotlin.adapter_pattern.implementation.Adaptee
import main.kotlin.adapter_pattern.implementation.Adapter

fun main() {
    val adaptee = Adaptee()
    val target: Target = Adapter(adaptee)

    target.request()
}