abstract  class Element {
    def contents: Array[String]
    def height: Int = contents.length
    def width: Int = if(height == 0) 0 else contents(0).length
}

class ArrayElement(
    val contents: Array[String]
) extends Element

class LineElement(s: String) extends ArrayElement(Array(s)) {
    override def width = s.length
    override def height = 1
}

class UniformElement(
    ch: Char,
    override val width: Int, 
    override val height: Int
) extends Element {
    private val line = ch.toString * width
    //def contents = Array.make(height, line)
    def contents = Array.fill(height)(line)
}

val e1: Element = new ArrayElement(Array("hello", "world"))
val ae: ArrayElement = new LineElement("hello")
val e2: Element = ae
val e3: Element = new UniformElement('x', 2, 3)

println(e3.contents)