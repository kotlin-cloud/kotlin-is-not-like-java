class MyActivity extends Activity {

   void example() {
       View view = findViewById(R.id.button);
       view.setOnClickListener(
           new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   Log.d("TAG", "Item clicked!");
               }
           }
       );
   }
}