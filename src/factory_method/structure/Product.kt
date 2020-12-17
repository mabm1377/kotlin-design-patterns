package factory_method.structure

interface Product {
    fun doStuff()
}

class ProductA : Product {
    override fun doStuff() {
        println("Working with product A")
    }
}

class ProductB : Product {
    override fun doStuff() {
        println("Working with product B")
    }
}