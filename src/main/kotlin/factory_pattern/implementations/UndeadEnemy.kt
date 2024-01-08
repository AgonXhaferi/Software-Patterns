package factory_pattern.implementations

import factory_pattern.abstract_factories.Enemy

class UndeadEnemy(
    name: String = "Undead Enemy",
    specialMove: String = "Undead Bite"
) : Enemy(name, specialMove) {
}