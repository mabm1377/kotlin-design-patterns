package abstract_factory.example

fun main() {
    // based on input or some condition
    val application = Application(WindowsFactory())
    application.printTogether()
    MacOsFactory()
}