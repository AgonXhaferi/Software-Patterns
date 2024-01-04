package decorater_pattern

import decorater_pattern.abstract_decorators.Addon
import decorater_pattern.abstract_decorators.Beverage
import decorater_pattern.implementations.CaramelAddon
import decorater_pattern.implementations.Espresso

fun main() {
    val espresso: Beverage = Espresso()
    val caramelAddon: Addon = CaramelAddon(espresso)
    val extraCaramelAddon: Addon = CaramelAddon(caramelAddon)

    println("Total price of this beverage is: ${extraCaramelAddon.cost()}");
}