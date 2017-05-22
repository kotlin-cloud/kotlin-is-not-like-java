fun f3(a: Int, b: Int, fn: (Int, Int) -> Int): Int =
       if (a > b) fn(a, b) else a - b

fun test() {
   f3(2, 1) { a1, a2 ->
       a1 + a2
   }                               // => 3       
   f3(2, 1, { a1, a2 -> a1 + a2})  // => 3
}