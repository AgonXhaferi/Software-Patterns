package strategy_pattern.ducks

import strategy_pattern.strategies.interfaces.FlyStrategy
import strategy_pattern.strategies.interfaces.QuackStrategy


class Duck(
    private val flyStrategy: FlyStrategy,
    private val quackStrategy: QuackStrategy
) {
    fun fly() = flyStrategy.fly()

    fun quack() = quackStrategy.quack()
}

