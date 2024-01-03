package observer_pattern.interfaces

interface IObservable<T>: IObservableData<T> {
    fun registerObserver(observer: IObserver)
    fun removeObserver(observer: IObserver)
    fun notifyObservers()
}