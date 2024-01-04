package decorater_pattern.implementations

import decorater_pattern.abstract_decorators.Beverage

class Espresso : Beverage() {
    override fun getDescription() = "Depresso"

    override fun cost() = 2.15
}