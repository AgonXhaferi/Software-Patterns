package abstract_factory_pattern.implementations.monsters

import factory_pattern.abstract_factories.Enemy

class MonsterEnemy(
    name: String = "Monster Enemy",
    specialMove: String = "Monster Breath"
) : Enemy(name, specialMove) {
}