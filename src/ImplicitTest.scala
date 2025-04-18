object ImplicitTest {
  def main(args: Array[String]): Unit = {
    //隐式函数
    case class Person(name: String)
    implicit def stringToPerson(name: String): Person = Person(name)
    val person: Person = "John"  // 自动调用stringToPerson
    println(person.name)  // 输出 "John"
    //隐式参数
    class Printer {
      def print(message: String)(implicit prefix: String): Unit =
        println(prefix + message)
    }
    implicit val defaultPrefix: String = "Log: "
    new Printer().print("Hello")  // 输出：Log: Hello
    //隐式类
    implicit class RichInt(val self: Int) {
      def getMax(n:Int): Int = if (self > n) self else n
      def getMin(n:Int): Int = if (self > n) n else self
    }
    println(5.getMax(3)) // 输出 5
  }
}
