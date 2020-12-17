package factory_method.example

interface Vehicle {
    fun deliver()
}

class Boat : Vehicle {
    override fun deliver() {
        println("deliver with boat")
    }
}

class Car : Vehicle {
    override fun deliver() {
        println("deliver with car")
    }
}