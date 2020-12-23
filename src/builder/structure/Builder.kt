package builder.structure

interface Builder {
    fun reset()
    fun buildStepA()
    fun buildStepB()
    fun buildSetupZ()
}

class ConcreteBuilder1 : Builder {
    var result: Product1 = Product1()
        private set
    override fun reset() {
        result = Product1()
    }

    override fun buildStepA() {
        result.featureA = 1
    }

    override fun buildStepB() {
        result.featureB = 2
    }

    override fun buildSetupZ() {
        result.featureZ = 3
    }

}


class ConcreteBuilder2 : Builder {
    var result: Product2 = Product2()
        private set
    override fun reset() {
        result = Product2()
    }

    override fun buildStepA() {
        result.featureA = "one"
    }

    override fun buildStepB() {
        result.featureB = "two"
    }

    override fun buildSetupZ() {
        result.featureZ = "three"
    }
}