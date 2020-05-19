import scala.io.Source

def widthOfLength(s: String) = s.length.toString.length

if(args.length > 0) {

    // pointer to buffer
    val lines = Source.fromFile(args(0)).getLines().toList

    // first lookup
    val longestLine = lines.reduceLeft(
        (a, b) => if (a.length > b.length) a else b)

    val maxWidth = widthOfLength(longestLine)

    // second lookup
    for(line <- lines) {
        val numSpaces = maxWidth - widthOfLength(line)
        val padding = " " * numSpaces
        println(padding + line.length + " | " + line)
    }
}
else
    Console.err.println("Please enter filename")