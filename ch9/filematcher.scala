object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesEnding(query: String) = 
        for (file <- filesHere; if file.getName.endsWith(query))
            yield file
    def filesContaining(query: String) =
        for (file <- filesHere; if file.getName.contains(query))
            yield file
    def filesRegex(query: String) =
        for (file <- filesHere; if file.getName.matches(query))
            yield file
    def filesMatching(query: String, 
                    matcher: (String, String) => Boolean) = {
        for (file <- filesHere; if matcher(file.getName, query))
            yield file
    }
}

//val files = FileMatcher.filesEnding(".scala")
//println(files(0).getName)
//for (file <- files) println(file.getName)

FileMatcher.filesEnding(".scala").foreach(println)

//for (file <- FileMatcher.filesEnding(".scala")) {
//    println(file)
//}

FileMatcher.filesContaining("sc").foreach(println)
FileMatcher.filesRegex(".*.scala").foreach(println)

