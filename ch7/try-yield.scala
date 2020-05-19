import java.net.URL
import java.net.MalformedURLException

def urlFor(path: String) =
    try {
        new URL(path)
    } catch {
        case e: MalformedURLException =>
            new URL("http://www.scala-lang.org")
    }

val url1 = urlFor("http///www.org")
val url2 = urlFor("http://www.ru")

println("url1="+url1, "url2="+url2)