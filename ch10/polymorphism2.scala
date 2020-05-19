abstract class Element {
    def demo() {
        println("Element's implementation invoked")
    }
}

class ArrayElement extends Element {
    override def demo() {
        println("ArrayElement's invoked")
    }
}

class LineElement extends Element {
    override def demo() {
        println("LineElement's invoked")
    }
}

class UniformElement extends Element

def invokeDemo(e: Element) {
    e.demo()
}

invokeDemo(new ArrayElement)
invokeDemo(new LineElement)
invokeDemo(new UniformElement)
