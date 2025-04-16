object IteratorTest {
  def main(args: Array[String]): Unit = {
    val it = Iterator("1", "2", "3", "4")

    while (it.hasNext){
      println(it.next())
    }

    val ita = Iterator(20,40,2,50,69, 90)
    val itb = Iterator(20,40,2,50,69, 90)
    println("ita.size 的值: " + ita.size )
    println("itb.length 的值: " + itb.length )

    println("最大元素是：" + ita.max )
    println("最小元素是：" + itb.min )

  }
}
