object FileMatcher {
    private def filesHere = (new java.io.File(".")).listFiles

    def filesMatching(matcher: String => Boolean) = {
        for (file <- filesHere; if matcher(file.getName))
            yield file
    }
    def filesEnding(query: String) = 
        filesMatching(_.endsWith(query))

    def filesContaining(query: String) =
        filesMatching(_.contains(query))

    def filesRegex(query: String) =
        filesMatching(_.matches(query))

}
FileMatcher.filesEnding(".scala").foreach(println)
FileMatcher.filesContaining("sc").foreach(println)
FileMatcher.filesRegex(".*.scala").foreach(println)

//val files = FileMatcher.filesEnding(".scala")
//println(files(0).getName)
//for (file <- files) println(file.getName)

//for (file <- FileMatcher.filesEnding(".scala")) {
//    println(file)
//}

