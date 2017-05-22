class MyUtils {

   static void example(View myView) {
       if (myView instanceof ImageView) {
           ImageView imageView =
               (ImageView) myView;
           imageView.setImageAlpha(10);
       } else if (myView instanceof TextView) {
           TextView textView = (TextView) myView;
           textView.setText("Ciao");
       }
   }
}