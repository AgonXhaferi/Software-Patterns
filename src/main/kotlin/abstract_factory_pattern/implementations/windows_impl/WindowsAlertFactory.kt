package abstract_factory_pattern.implementations.windows_impl

import abstract_factory_pattern.abstract_factories.AlertDialogFactory
import abstract_factory_pattern.abstract_factories.Button
import abstract_factory_pattern.abstract_factories.Dialog

class WindowsAlertFactory : AlertDialogFactory() {
    override fun createDialog(): Dialog = WindowsDialog()

    override fun createButton(): Button = WindowsButton()
}