import Array._

object ArrayTest {
  def main(args: Array[String]): Unit = {
    /* *
    处理数组
    * */
    var myList = Array(1.9, 2.9, 3.4, 3.5)

    // 输出所有数组元素
    for ( x <- myList ) {
      println( x )
    }

    // 计算数组所有元素的总和
    var total = 0.0;
    for ( i <- 0 to (myList.length - 1)) {
      total += myList(i)
    }
    println("总和为 " + total);

    // 查找数组中的最大元素
    var max = myList(0);
    for ( i <- 1 to (myList.length - 1) ) {
      if (myList(i) > max) max = myList(i)
    }
    println("最大值为 " + max)
  }

  /* *
  多维数组
   */
  val myMatrix = Array.ofDim[Int](3, 3)

  // 创建矩阵
  for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
      myMatrix(i)(j) = j;
    }
  }

  // 打印二维阵列
  for (i <- 0 to 2) {
    for ( j <- 0 to 2) {
      print(" " + myMatrix(i)(j));
    }
    println();
  }

  /* *
  合并数组
   */
  var myList1 = Array(1.9, 2.9, 3.4, 3.5)
  var myList2 = Array(8.9, 7.9, 0.4, 1.5)

  var myList3 =  concat( myList1, myList2)

  // 输出所有数组元素
  for ( x <- myList3 ) {
    println( x )
  }

  /* *
    创建区间数组
   */
  var myList4 = range(10, 20, 2)
  var myList5 = range(10,20)

  // 输出所有数组元素
  for ( x <- myList4 ) {
    print( " " + x )
  }
  println()
  for ( x <- myList5 ) {
    print( " " + x )
  }

}
