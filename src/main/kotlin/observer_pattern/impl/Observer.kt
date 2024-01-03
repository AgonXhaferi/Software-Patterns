package observer_pattern.impl

import observer_pattern.interfaces.IObservable
import observer_pattern.interfaces.IObserver

class Observer(private val observable: IObservable<Int>) : IObserver {
    override fun update() {
        println(this.observable.getValue())
    }
}