package factory_method

abstract class Logistics {
    fun someOperation(a: Any?) {
        createVehicle().deliver()
    }
    abstract fun createVehicle(): Vehicle
}

class SeaLogistics() : Logistics() {
    override fun createVehicle(): Boat {
        return Boat()
    }

}

class RoadLogistics() : Logistics() {
    override fun createVehicle(): Car {
        return Car()
    }
}
