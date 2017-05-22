class MyKotlinActivity : Activity() {
   val textView by lazy { findViewById(R.id.text) as TextView }
   val res by lazy { resources.getString(R.string.cancel) }
}