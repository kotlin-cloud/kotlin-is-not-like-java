public class MyKotlinClass {
   val a: Int = 1
   var b: Int = 1
   val c = 1
   var d = 1
       private set
}

fun example() {
   val myClass = MyKotlinClass()
   myClass.b = 2
}