// in Kotlin is synchronized
class MyJavaClass {
   class MyItem { }

   MyItem item;

   final MyItem getItem() {
       if (item == null) {
           item = new MyItem();
       }
       return item;
   }
}