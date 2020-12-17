package factory_method.example

fun main() {
    val logistics: Logistics = when(readLine()!!) {
        "boat" -> SeaLogistics()
        "car" -> RoadLogistics()
        else -> throw IllegalArgumentException("logistic not found")
    }
    logistics.deliver()
}