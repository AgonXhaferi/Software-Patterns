package decorater_pattern.implementations

import decorater_pattern.abstract_decorators.Addon
import decorater_pattern.abstract_decorators.Beverage

class CaramelAddon(private val beverage: Beverage) : Addon(beverage) {
    override fun getDescription(): String = "This is a Caramel"

    override fun cost(): Double {
        return this.beverage.cost() + 1.0
    }
}