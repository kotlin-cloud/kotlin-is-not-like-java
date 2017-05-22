//usage
fun testDSL() {
   convert("ABC") {
       toLower()    //ABC =&gt; abc
       toUpper()    //abc =&gt; ABC
   }
   convert(2.2) {
       toLower()    //2.2 =&gt; 2.0
   }
   convert(2) {
       toLower()    //编译器：没有这个方法
   }
}

//implementation
class MConverter&lt;T&gt;(var value: T) {
   val old = value
   override fun toString(): String = 
      	     "[$old] =&gt; [$value]"
}

fun &lt;T&gt; convert(
   value: T,
   init: MConverter&lt;T&gt;.() -&gt; Unit): MConverter&lt;T&gt; {
   val converter = MConverter(value)
   converter.init()
   return converter
}

fun MConverter&lt;String&gt;.toLower() {
   value = value.toLowerCase()
}

fun MConverter&lt;String&gt;.toUpper() {
   value = value.toUpperCase()
}

fun MConverter&lt;Double&gt;.toLower() {
   value = Math.floor(value)
}