object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesMatching(query: String, 
                    matcher: (String, String) => Boolean) = {
        for (file <- filesHere; if matcher(file.getName, query))
            yield file
    }
    def filesEnding(query: String) = 
        filesMatching(query, _.endsWith(_))

    def filesContaining(query: String) =
        filesMatching(query, _.contains(_))

    def filesRegex(query: String) =
        filesMatching(query, _.matches(_))

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

