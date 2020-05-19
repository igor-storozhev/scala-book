abstract  class Element {
    def contents: Array[String]
    def height: Int = contents.length
    def width: Int = if(height == 0) 0 else contents(0).length
}

//new Element

abstract  class Element2 {
    def contents: Array[String]
    val height = contents.length
    val width = if(height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
    def contents: Array[String] = conts
}

val ae = new ArrayElement(Array("test1","test2"))

println(ae.height, ae.width)

val e: Element = new ArrayElement(Array("hello", "world"))

println(e.width)

class ArrayElement2(conts: Array[String]) extends Element {
    val contents: Array[String] = conts
}

val ae2 = new ArrayElement2(Array("Hello","again"))
println(ae2.width)

class ArrayElement3(
    val contents: Array[String]
) extends Element

val ae3 = new ArrayElement3(Array("Hi","there"))
println(ae3.width)