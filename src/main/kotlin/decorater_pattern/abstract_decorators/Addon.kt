package decorater_pattern.abstract_decorators

abstract class Addon(private val beverage: Beverage) : Beverage() {
}