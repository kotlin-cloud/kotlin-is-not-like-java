static class MyUtils {
   void example(String e, String f) {
       e.length(); // throw NullPointerException?
       f.length(); // throw NullPointerException?

       if (e != null) {
           e.length();
       }

       if (f != null) {
           e.length();
       }
   }
}