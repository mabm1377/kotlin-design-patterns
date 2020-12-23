package abstract_factory.example

interface Button {
    fun paintButton()
}

interface Checkbox {
    fun paintCheckbox()
}

interface TextField {
    fun paintTextField()
}

class MacOsButton : Button {
    override fun paintButton() {
        println("This is a mac button")
    }
}

class MacOsCheckbox : Checkbox {
    override fun paintCheckbox() {
        println("This is a mac checkbox")
    }
}

class MacOsTextField : TextField {
    override fun paintTextField() {
        println("This is a mac text field")
    }
}

class WindowsButton : Button {
    override fun paintButton() {
        println("This is a windows button")
    }
}

class WindowsCheckbox : Checkbox {
    override fun paintCheckbox() {
        println("This is a windows checkbox")
    }
}

class WindowsTextField : TextField {
    override fun paintTextField() {
        println("This is a windows text field")
    }
}

interface AbstractFactory {
    fun createCheckbox(): Checkbox

    fun createButton(): Button

    fun createTextField(): TextField
}

class MacOsFactory : AbstractFactory {
    override fun createCheckbox() = MacOsCheckbox()

    override fun createButton() = MacOsButton()

    override fun createTextField() = MacOsTextField()
}

class WindowsFactory : AbstractFactory {
    override fun createCheckbox() = WindowsCheckbox()

    override fun createButton() = WindowsButton()

    override fun createTextField() = WindowsTextField()
}

class Application(abstractFactory: AbstractFactory) {
    private val textField: TextField = abstractFactory.createTextField()
    private val button: Button = abstractFactory.createButton()
    private val checkbox: Checkbox = abstractFactory.createCheckbox()
    fun printTogether() {
        button.paintButton()
        checkbox.paintCheckbox()
        textField.paintTextField()
    }
}