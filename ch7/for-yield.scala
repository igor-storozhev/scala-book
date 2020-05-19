val filesHere = (new java.io.File(".")).listFiles

def scalaFiles = 
    for {
        file <- filesHere
        if file.getName.endsWith(".scala")
    } yield file

for (file <- scalaFiles)    println(file.getName)

def fileLines(file: java.io.File) =
    scala.io.Source.fromFile(file).getLines.toList

val forLineLength =
    for {
        file <- filesHere
        if file.getName.endsWith(".scala")
        line <- fileLines(file)
        trimmed = line.trim 
        if trimmed.matches(".*for.*")
    } yield trimmed.length

for (num <- forLineLength) println(num)