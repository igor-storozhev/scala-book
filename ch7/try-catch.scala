import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
    val f = new FileReader("input.txt")
    //.. use, close file

} catch {
    case ex: FileNotFoundException => 
                            println("file not found")
    case ex: IOException => println("i/o error")
}