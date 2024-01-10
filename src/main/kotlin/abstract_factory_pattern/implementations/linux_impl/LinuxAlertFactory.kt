package abstract_factory_pattern.implementations.linux_impl

import abstract_factory_pattern.abstract_factories.AlertDialogFactory
import abstract_factory_pattern.abstract_factories.Button
import abstract_factory_pattern.abstract_factories.Dialog

class LinuxAlertFactory : AlertDialogFactory() {
    override fun createDialog(): Dialog = LinuxDialog()

    override fun createButton(): Button = LinuxButton()
}