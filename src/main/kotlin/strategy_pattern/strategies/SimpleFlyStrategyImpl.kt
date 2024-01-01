package strategy_pattern.strategies

import strategy_pattern.strategies.interfaces.FlyStrategy

class SimpleFlyStrategyImpl : FlyStrategy {
    override fun fly(): String {
        return "Normal flying"
    }

}