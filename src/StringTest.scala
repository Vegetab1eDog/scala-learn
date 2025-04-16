object StringTest {
  def main(args: Array[String]): Unit = {
    var s1: String = "Hello World"
    println(s1)
    s1="Hello Scala."+s1
    println(s1)
    println(s1.length())
    var s2=new StringBuilder()
    s2.append("Hello")
    println(s2.concat(s1))
  }
}
