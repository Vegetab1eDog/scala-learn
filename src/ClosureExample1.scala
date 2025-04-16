object ClosureExample1 {
  def main(args: Array[String]): Unit = {
    var externalVar = 10

    val closure = (x: Int) => x + externalVar

    println(closure(5))  // 输出 15

    externalVar = 20

    println(closure(5))  // 输出 25
  }
}