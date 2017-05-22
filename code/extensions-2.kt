inline fun &lt;reified T : Any&gt; Activity.service(): T {
   return HttpService.getApiService(T::class.java)
}

fun Activity.toast(str: String) {
   Toast.makeText(this, str,Toast.LENGTH_SHORT).show()
}


class MyActivity : Activity() {
	
   val baiduService = service<Api>()

   fun test() {
       toast("hahaha")
   }
}