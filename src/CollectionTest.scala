object CollectionTest {
  def main(args: Array[String]): Unit = {
    // 定义整型 List
    val x1 = List(1,2,3,4)
    println(x1)
    println(x1(2))

    // 定义 Set
    val x2 = Set(1,3,5,7)
    println(x2)
    println(x2.contains(2))

    // 定义 Map
    val x3 = Map("one" -> 1, "two" -> 2, "three" -> 3)
    println(x3)
    println(x3("two"))

    // 创建两个不同类型元素的元组
    val x4 = (10, "ten")
    println(x4)
    println(x4._1)

    // 定义 Option
    val x5:Option[Int] = Some(5)
    println(x5)

  }
}
