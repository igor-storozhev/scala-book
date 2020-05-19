abstract class Element {
  def contents: Array[String]
  def height = contents.length
  def width = if(height == 0) 0 else contents(0).length
  
  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)
  def beside(that: Element): Element =
    new ArrayElement(
      for(
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  override def toString = contents mkString "\n"
}

class ArrayElement(
  val contents: Array[String]
) extends Element {
    def demo() { println("test") }
}
/*
class LineElement(s: String) extends ArrayElement(Array(s)) {
  override def width = s.length
  override def height = 1
  override def demo() { println("test 2")}
}
*/
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}

class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element {
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}

// companion factory object
object Element {
  def elem(contents: Array[String]) =
      new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element = 
    new UniformElement(chr, width, height)
    
  def elem(line: String) =
    new LineElement(line)
}

val e1: Element = new ArrayElement(Array("Hello","world"))
val ae: Element = new LineElement("hello")
val e2: Element = ae
val e3: Element = new UniformElement('x', 2, 3)

println(e1.contents(0), ae.height, e2.contents(0), e3.contents(0))
