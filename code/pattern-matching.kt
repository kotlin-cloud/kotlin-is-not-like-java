fun example1(myView: View) {
   if (myView is ImageView) {
       myView.setImageAlpha(10)
   } else if (myView is TextView) {
       myView.setText("Ciao")
   }
}
//or
fun example2(myView: View) {
   when (myView) {
       is ImageView -> myView.imageAlpha = 10
       is TextView -> myView.text = "Ciao"
   }
}