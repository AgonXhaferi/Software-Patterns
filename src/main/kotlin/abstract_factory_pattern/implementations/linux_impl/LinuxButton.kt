package abstract_factory_pattern.implementations.linux_impl

import abstract_factory_pattern.abstract_factories.Button

class LinuxButton(
    buttonShape: String = "Linux Round Shape",
    buttonColor: String = "Linux Color Red"
) :
    Button(buttonShape, buttonColor) {
}