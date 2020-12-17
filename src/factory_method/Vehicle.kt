package factory_method

interface Vehicle {
    fun deliver()
}

class Boat() : Vehicle {
    override fun deliver() {
        TODO("Not yet implemented")
    }
}

class Car() : Vehicle {
    override fun deliver() {
        TODO("Not yet implemented")
    }
}