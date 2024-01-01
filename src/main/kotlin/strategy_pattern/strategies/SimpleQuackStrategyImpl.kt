package strategy_pattern.strategies

import strategy_pattern.strategies.interfaces.QuackStrategy

class SimpleQuackStrategyImpl: QuackStrategy {
    override fun quack(): String {
        return "Normal quacking"
    }
}