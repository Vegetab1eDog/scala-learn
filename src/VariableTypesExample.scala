object VariableTypesExample {
  def main(args: Array[String]): Unit = {
    // 显式类型声明
    val explicitInt: Int = 42
    val explicitDouble: Double = 3.14
    val explicitString: String = "Hello, Scala!"
    val explicitBoolean: Boolean = true

    // 类型推断
    val inferredInt = 42  // 编译器推断为 Int
    val inferredDouble = 3.14  // 编译器推断为 Double
    val inferredString = "Hello, Scala!"  // 编译器推断为 String
    val inferredBoolean = true  // 编译器推断为 Boolean

    // 可变变量
    var mutableInt: Int = 10
    println(s"Initial mutableInt: $mutableInt")
    mutableInt = 20  // 修改变量值
    println(s"Updated mutableInt: $mutableInt")

    // 输出所有变量
    println(s"Explicit Int: $explicitInt")
    println(s"Explicit Double: $explicitDouble")
    println(s"Explicit String: $explicitString")
    println(s"Explicit Boolean: $explicitBoolean")

    println(s"Inferred Int: $inferredInt")
    println(s"Inferred Double: $inferredDouble")
    println(s"Inferred String: $inferredString")
    println(s"Inferred Boolean: $inferredBoolean")
  }
}