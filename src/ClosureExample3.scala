object ClosureExample3 {
  def main(args: Array[String]): Unit = {
    var messages = List("Hello", "World")

    val addMessage = (msg: String) => messages = messages :+ msg

    addMessage("Scala")
    println(messages)  // 输出 List(Hello, World, Scala)
  }
}