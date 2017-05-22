class MyJavaActivity extends Activity {

   TextView textView;
   String res; 

   protected void onCreate(BundlesavedInstanceState) {
       super.onCreate(savedInstanceState);
       textView = (TextView) findViewById(R.id.text);
       res = getResources().getString(R.id.cancel)
   }
}