package builder.structure

abstract class Product {
    abstract val featureA: Any
    abstract val featureB: Any
    abstract val featureZ: Any
    override fun toString(): String = "$featureA $featureB $featureZ"
}

class Product1 : Product() {
    override var featureA: Int = 0
    override var featureB: Int = 0
    override var featureZ: Int = 0


}

class Product2 : Product() {
    override var featureA: String = "0"
    override var featureB: String = "0"
    override var featureZ: String = "0"
}
