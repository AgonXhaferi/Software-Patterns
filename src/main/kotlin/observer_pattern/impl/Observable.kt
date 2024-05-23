package observer_pattern.impl

import observer_pattern.interfaces.IObservable
import observer_pattern.interfaces.IObserver

class Observable(
    private val observers: MutableList<IObserver> = mutableListOf(),
    private var initialNumber: Int = 0
) : IObservable<Int> {
    override fun registerObserver(observer: IObserver) {
        this.observers.add(observer)
    }

    override fun removeObserver(observer: IObserver) {
        this.observers.remove(observer)
    }

    override fun notifyObservers() {
        this.observers.forEach { it -> it.update() }
    }

    override fun getData(): Int {
        return this.initialNumber
    }

    override fun setData(newValue: Int) {
        this.initialNumber = newValue

        notifyObservers()
    }
}