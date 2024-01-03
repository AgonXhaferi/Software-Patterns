package observer_pattern

import observer_pattern.impl.Observable
import observer_pattern.impl.Observer
import observer_pattern.interfaces.IObservable
import observer_pattern.interfaces.IObserver

fun main(){
    val observable: IObservable<Int> = Observable()

    val observer: IObserver = Observer(observable)
    val observer2 : IObserver = Observer(observable)

    observable.registerObserver(observer)
    observable.registerObserver(observer2)

    observable.setValue(10)
    observable.setValue(50)
}