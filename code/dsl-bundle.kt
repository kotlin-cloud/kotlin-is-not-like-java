fun bundle(vararg pair: Pair&lt;String, Any&gt;): Bundle {
    val bundle = Bundle()
    for ((k, v) in pair) {
        when (v) {
           is String -&gt; this.putString(k, v)
           is Int -&gt; this.putInt(k, v)
           is Serializable -&gt; this.putSerializable(k, v)
           is Bundle -&gt; this.putBundle(k, v)
           is Long -&gt; this.putLong(k, v)
           ...
        }
    }
    return bundle
}

inline fun &lt;reified T : Activity&gt; Activity.jump(requestCode: Int, extras: Bundle) =
       ActivityUtils.jump(this, T::class.java, requestCode, extras)


fun example() {
    jump&lt;MainActivity&gt;(SOME_CODE, bundle("int-key" to 1, "string-key" to 2))
}