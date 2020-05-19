class Cat {
    val dangerous = false
}
class Tiger(
    override val dangerous: Boolean,
    private var age: Int
) extends Cat

val tiger = new Tiger(true, 35)
println(tiger.dangerous)