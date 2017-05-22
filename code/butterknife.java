//usage
class MyActivity extends Activity {
   @Bind(R.id.text)
   TextView someText;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       ButterKnife.bind(this);
   }
}

//implementation: 
//https://github.com/JakeWharton/butterknife
//tons of code