class MyKotlinClass {
   var a: String = "ciao"
   var b: String = null  // Error at compile time
   var c: String? = null
   var d: String? = "ok"

   fun example(e: String, f: String?) {
       e.length()
       f.length()        // Error at compile time
       f?.length()

       if (f != null) {
           f.length()
       }
   }
}