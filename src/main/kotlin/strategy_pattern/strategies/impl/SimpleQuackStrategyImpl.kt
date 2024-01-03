package strategy_pattern.strategies.impl

import strategy_pattern.strategies.interfaces.QuackStrategy

class SimpleQuackStrategyImpl: QuackStrategy {
    override fun quack(): String {
        return "Normal quacking"
    }
}