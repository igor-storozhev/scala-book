class Point(val xCoord: Int, val yCoord: Int) {
    val x: Int = xCoord
    val y: Int = yCoord
}

trait Rectangular {
    def topLeft: Point
    def bottomRight: Point

    def left = topLeft.x
    def right = bottomRight.x
    def width = right - left
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {

}

val rect = new Rectangle(new Point(1,1), new Point(10,10))
println(rect.left, rect.right, rect.width)