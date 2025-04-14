object LiteralsExample {
  def main(args: Array[String]): Unit = {
    // 数值字面量
    val decimal = 42
    val hex = 0x2A
    val doubleValue = 3.14
    val floatValue = 3.14f

    // 字符字面量
    val charA = 'A'
    val charNewLine = '\n'

    // 字符串字面量
    val greeting = "Hello, World!"
    val multilineString = """This is
                            |a multi-line
                            |string""".stripMargin

    // 布尔字面量
    val isScalaFun = true
    val isSkyGreen = false

    // 特殊字面量
    val nullValue: String = null
    val unitValue: Unit = ()

    // 输出示例
    println(s"Decimal: $decimal, Hex: $hex")
    println(s"Double: $doubleValue, Float: $floatValue")
    println(s"Char: $charA, New Line: $charNewLine")
    println(s"Greeting: $greeting")
    println(s"Multiline String: $multilineString")
    println(s"Is Scala Fun: $isScalaFun, Is Sky Green: $isSkyGreen")
    println(s"Null Value: $nullValue, Unit Value: $unitValue")
  }
}