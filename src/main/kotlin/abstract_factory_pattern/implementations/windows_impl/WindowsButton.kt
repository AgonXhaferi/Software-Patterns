package abstract_factory_pattern.implementations.windows_impl

import abstract_factory_pattern.abstract_factories.Button

class WindowsButton(
    buttonShape: String = "Windows Sharp Shape",
    buttonColor: String = "Windows Color Blue"
) :
    Button(buttonShape, buttonColor)