package factory_method.structure

abstract class Creator {
    fun someOperation() {}
    abstract fun createProduct(): Product
}

class ConcreteCreatorA : Creator() {
    override fun createProduct() = ProductA()
}

class ConcreteCreatorB : Creator() {
    override fun createProduct() = ProductB()
}

