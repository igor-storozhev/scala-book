import java.io.FileReader

val file = new FileReader("input.txt")
try {
    // Use file

} finally {
    println("file closing")
    file.close()
}