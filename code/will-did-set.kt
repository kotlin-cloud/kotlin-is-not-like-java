//usage
var x: Int by varWithObservableSetter(5)
       .willSet { println("before") }
       .didSet { println("after") }

var y: String by varWithObservableSetter("abc")
       .didSet { println("after") }


fun test() {
   x = 10      // before 5     // after 10
   y = "haha"  //after "haha"
}

//implementation
class VarWithObservableSetter&lt;T,
       out TWillSet : (() -&gt; Unit)?,
       out TDidSet : (() -&gt; Unit)?&gt;
internal constructor(
       val initialValue: T,
       internal val wilLSet: TWillSet,
       internal val didSet: TDidSet
) : ObservableProperty&lt;T&gt;(initialValue) {
   override fun beforeChange(property: KProperty&lt;*&gt;, oldValue: T, newValue: T): Boolean {
       wilLSet?.invoke()
       return true
   }

   override fun afterChange(property: KProperty&lt;*&gt;, oldValue: T, newValue: T) {
       didSet?.invoke()
   }
}

fun &lt;T&gt; varWithObservableSetter(initialValue: T) =
       VarWithObservableSetter(initialValue, null, null)

fun &lt;T, R : (() -&gt; Unit)?&gt;
       VarWithObservableSetter&lt;T, Nothing?, R&gt;.willSet(action: () -&gt; Unit) =
       VarWithObservableSetter(initialValue, action, didSet)

fun &lt;T, R : (() -&gt; Unit)?&gt;
       VarWithObservableSetter&lt;T, R, Nothing?&gt;.didSet(action: () -&gt; Unit) =
       VarWithObservableSetter(initialValue, wilLSet, action)

