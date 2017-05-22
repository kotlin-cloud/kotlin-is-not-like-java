//usage
someService.someApi(param1, param2).enqueue {
   onResponse {
      toast("succeed")
   }
   onFailure { toast("failed") }
   onFinish { hideLoading() }
}

//implementation
inline fun &lt;T&gt; Call&lt;T&gt;.enqueue(init: CallbackHelper&lt;T&gt;.() -&gt; Unit) {
   val listener = CallbackHelper&lt;T&gt;()
   listener.init()
   enqueue(listener)
}

class CallbackHelper&lt;T&gt; : Callback&lt;T&gt; {

   private var _onResponse: ((T) -&gt; Unit)? = null
   private var _onFailure: ((Throwable) -&gt; Unit)? = null
   private var _onFinish: (() -&gt; Unit)? = null

   override fun onResponse(call: Call&lt;T&gt;, response: Response&lt;T&gt;) {
       onResponse?.invoke(response.body())
       _onFinish?.invoke()
   }

   fun onResponse(listener: (T) -&gt; Unit) {
       _onResponse = listener
   }

   fun onFinish(listener: () -&gt; Unit) {
       _onFinish = listener
   } 

   override fun onFailure(call: Call&lt;T&gt;, t: Throwable) {
       _onFailure?.invoke(t)
       _onFinish?.invoke()
   }

   fun onFailure(listener: (Throwable) -&gt; Unit) {
       _onFailure = listener
   }
}