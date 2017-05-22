fun String.isBig(): Boolean {
   return length() > 10
}

fun example() {
   "why?!".isBig()                 // false!
   "P90, RUSH B, ...".isBig()   // true!
}