//usage
class MyActivity : Activity() {
   val someText by bindView&lt;TextView&gt;(R.id.text)
}

//implementation
private class Lazy&lt;T, V&gt;(private val initializer: (T, KProperty&lt;*&gt;) -&gt; V) : ReadOnlyProperty&lt;T, V&gt; {
    private object EMPTY

    private var value: Any? = EMPTY

    override fun getValue(thisRef: T, property: KProperty&lt;*&gt;): V {
        if (value == EMPTY) {
  value = initializer(thisRef, property)
        }
        @Suppress("UNCHECKED_CAST")
        return value as V
    }
}

public fun &lt;V : View&gt; Activity.bindView(id: Int)
        : ReadOnlyProperty&lt;Activity, V&gt; = required(id, viewFinder)

private val Activity.viewFinder: Activity.(Int) -&gt; View?
    get() = { findViewById(it) }

private fun &lt;T, V : View&gt; required(id: Int, finder: T.(Int) -&gt; View?)
        = Lazy { t: T, desc -&gt; t.finder(id) as V? ?: viewNotFound(id, desc) }