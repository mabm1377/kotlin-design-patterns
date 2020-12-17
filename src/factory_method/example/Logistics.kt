package factory_method.example

abstract class Logistics {
    fun deliver() {
        createVehicle().deliver()
    }
    abstract fun createVehicle(): Vehicle
}

class SeaLogistics : Logistics() {
    override fun createVehicle() = Boat()

}

class RoadLogistics : Logistics() {
    override fun createVehicle() = Car()
}
