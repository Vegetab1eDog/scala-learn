object TupleDestructuring {
  def main(args: Array[String]): Unit = {
    // 使用元组解构同时声明多个变量
    val (a, b, c) = (1, 2, "hello")
    println(s"a: $a, b: $b, c: $c")

    // 使用元组解构同时声明多个可变变量
    var (x, y, z) = (10, 20, "world")
    println(s"x: $x, y: $y, z: $z")

    // 修改可变变量的值
    x = 30
    y = 40
    z = "Scala"
    println(s"Updated x: $x, y: $y, z: $z")
  }
}