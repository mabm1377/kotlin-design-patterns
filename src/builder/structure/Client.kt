package builder.structure

fun main() {
    var builder1 = ConcreteBuilder1()
    val director = Director(builder1)
    director.make("simple")
    var simplePoduct = builder1.result
    println(simplePoduct)
    director.make("other")
    var otherProduct= builder1.result
    println(otherProduct)

}