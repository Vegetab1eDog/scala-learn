object ForComprehension {
  def main(args: Array[String]): Unit = {
    // 同时声明多个变量用于迭代
    val numbers = List((1, "one"), (2, "two"), (3, "three"))
    for ((number, word) <- numbers) {
      println(s"Number: $number, Word: $word")
    }

    // 使用 for 推导式生成新集合
    val newNumbers = for {
      (number, word) <- numbers
    } yield (number * 2, word.toUpperCase)

    println(s"New Numbers: $newNumbers")
  }
}