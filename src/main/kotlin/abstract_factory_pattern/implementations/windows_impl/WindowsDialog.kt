package abstract_factory_pattern.implementations.windows_impl

import abstract_factory_pattern.abstract_factories.Dialog


class WindowsDialog(
    dialogShape: String = "Windows Dialog Shape",
    dialogSize: Int = 40
) : Dialog(dialogShape, dialogSize) {}