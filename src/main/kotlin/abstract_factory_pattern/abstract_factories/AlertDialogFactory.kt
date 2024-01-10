package abstract_factory_pattern.abstract_factories

abstract class AlertDialogFactory {
    abstract fun createDialog() : Dialog

    abstract fun createButton() : Button
}