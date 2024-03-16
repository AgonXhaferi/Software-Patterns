package abstract_factory_pattern.implementations.factories

import abstract_factory_pattern.implementations.monsters.MonsterEnemy
import abstract_factory_pattern.implementations.monsters.UndeadEnemy
import factory_pattern.abstract_factories.Enemy
import factory_pattern.abstract_factories.EnemyFactory
import kotlin.random.Random

class RandomEnemyFactory : EnemyFactory() {
    override fun createEnemy(): Enemy {
        val generatedRandomNumber = generateRandomNumber()

        return when (generatedRandomNumber) {
            0 -> MonsterEnemy()
            1 -> UndeadEnemy()
            else -> throw Error("This type doesn't exist")
        }

    }

    private fun generateRandomNumber(): Int = Random.nextInt(2)
}