package observer_pattern.interfaces

interface IObservableValues<T> {
    fun getValue(): T

    fun setValue(newValue: T)
}