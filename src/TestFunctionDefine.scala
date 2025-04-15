object TestFunctionDefine {

  def main(args: Array[String]): Unit = {


    //  函数 1：无参，无返回值
    def test1(): Unit = {

      println("1：无参，无返回值")
    }
    test1()

    //  函数 2：无参，有返回值
    def test2(): String = {

      "2：无参，有返回值"
    }
    println(test2())

    //  函数 3：有参，无返回值
    def test3(s: String): Unit = {

      println("3：有参，无返回值" + s)
    }
    test3("Hi")

    //  函数 4：有参，有返回值
    def test4(s: String): String = {

      s + "4：有参，有返回值"
    }
    println(test4("hello "))

    //  函数 5：多参，无返回值
    def test5(name: String, age: Int): Unit = {

      println(s"${
        name}今年${
        age}岁")
    }
    test5("testname", 18)

    //  函数 6：多参，有返回值
    def test6(a: Int, b: Int): Int = {

      a + b
    }
    println(test6(10, 20))

  }
}
