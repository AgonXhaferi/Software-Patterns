package strategy_pattern.strategies.impl

import strategy_pattern.strategies.interfaces.FlyStrategy

class SimpleFlyStrategyImpl : FlyStrategy {
    override fun fly(): String {
        return "Normal flying"
    }

}