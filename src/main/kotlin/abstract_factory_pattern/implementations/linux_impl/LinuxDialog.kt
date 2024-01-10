package abstract_factory_pattern.implementations.linux_impl

import abstract_factory_pattern.abstract_factories.Dialog


class LinuxDialog(
    dialogShape: String = "Linux Dialog Shape",
    dialogSize: Int = 20
) : Dialog(dialogShape, dialogSize) {
}