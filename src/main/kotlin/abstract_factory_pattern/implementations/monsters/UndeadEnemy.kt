package abstract_factory_pattern.implementations.monsters

import factory_pattern.abstract_factories.Enemy

class UndeadEnemy(
    name: String = "Undead Enemy",
    specialMove: String = "Undead Bite"
) : Enemy(name, specialMove) {
}