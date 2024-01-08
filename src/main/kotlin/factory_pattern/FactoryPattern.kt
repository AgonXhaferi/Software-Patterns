package factory_pattern

import factory_pattern.abstract_factories.EnemyFactory
import factory_pattern.implementations.RandomEnemyFactory
import java.util.Random

fun main() {
    val randomEnemyFactory: EnemyFactory = RandomEnemyFactory()

    val generatedMonster = randomEnemyFactory.createEnemy()
    val generatedSecondMonster = randomEnemyFactory.createEnemy()

    println("You've generated: [${generatedMonster.name}] with the special move: [${generatedMonster.specialMove}]")
    println("You've generated: [${generatedSecondMonster.name}] with the special move: [${generatedSecondMonster.specialMove}]")
}