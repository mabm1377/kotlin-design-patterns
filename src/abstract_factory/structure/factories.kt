package abstract_factory.structure

class ConcreteFactoryA : AbstractFactory {
    override fun createProduct1() = ConcreteProduct1A()
    override fun createProduct2() = ConcreteProduct2A()
}

class ConcreteFactoryB : AbstractFactory {
    override fun createProduct1() = ConcreteProduct1B()
    override fun createProduct2() = ConcreteProduct2B()
}