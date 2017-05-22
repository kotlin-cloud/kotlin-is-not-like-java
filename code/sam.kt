class MyActivity : Activity() {

   fun example() {
       val view = findViewById(R.id.button)
       view.setOnClickListener {
           Log.d("TAG", "Item clicked!")
       }
   }
}