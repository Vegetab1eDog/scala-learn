object MultipleVariables {
  def main(args: Array[String]): Unit = {
    // 同时声明多个不可变变量
    val a, b, c: Int = 5
    println(s"a: $a, b: $b, c: $c")

    // 同时声明多个可变变量
    var x, y, z: Int = 10
    println(s"x: $x, y: $y, z: $z")

    // 修改可变变量的值
    x = 20
    y = 30
    z = 40
    println(s"Updated x: $x, y: $y, z: $z")
  }
}