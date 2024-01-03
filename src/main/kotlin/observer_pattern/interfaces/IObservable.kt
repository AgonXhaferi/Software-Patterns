package observer_pattern.interfaces

interface IObservable<T>: IObservableValues<T> {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}