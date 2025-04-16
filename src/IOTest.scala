import java.io._
import scala.io.Source
object IOTest {
  def main(args: Array[String]) {
    val writer = new PrintWriter(new File("test.txt" ))

    writer.write("test text")
    writer.close()

    println("文件内容为:" )

    Source.fromFile("test.txt" ).foreach{
      print
    }
  }
}
