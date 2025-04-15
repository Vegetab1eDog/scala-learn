object WhileTest {
  def main(args: Array[String]): Unit = {
    var a = 10
    // 无限循环
    while( a<100 ){
      a=a+1
      println( "a 的值为 : " + a )
    }
  }
}
