val a = 1
val b = 2

val f1 = { a: Int, b: Int -> a + b }

fun f2(a: Int, b: Int): Int {
   return a + b
}

fun f2_(a: Int, b: Int): Int = a + b

fun f3(a: Int, b: Int, fn: (Int, Int) -> Int): Int =
       if (a > b) fn(a, b) else a - b

class MyKotlinClass {
   fun test() {
       print(f1(a, b))         // => 3
       print(f2(a, b))         // => 3
       print(f3(a, b, f1))     // => -1
       print(f3(2, 1, ::f2))   // => 3
   }
}