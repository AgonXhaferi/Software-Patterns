package strategy_pattern

import strategy_pattern.ducks.Duck
import strategy_pattern.strategies.impl.SimpleFlyStrategyImpl
import strategy_pattern.strategies.impl.SimpleQuackStrategyImpl
import strategy_pattern.strategies.interfaces.FlyStrategy
import strategy_pattern.strategies.interfaces.QuackStrategy

fun main() {
    //We can plug and play with different strategies here.
    val flyStrategy: FlyStrategy = SimpleFlyStrategyImpl()
    val quackStrategy: QuackStrategy = SimpleQuackStrategyImpl()

    val duck = Duck(flyStrategy, quackStrategy)

    println("This duck has the :[${duck.fly()}] fly behavior and the :[${duck.quack()}] quack behavior. ")
}


