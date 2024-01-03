package observer_pattern.interfaces

interface IObservableData<T> {
    fun getData(): T

    fun setData(newValue: T)
}