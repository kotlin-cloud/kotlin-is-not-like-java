// file MyUtils.java
class MyUtils {
   static boolean isBig(String str) {
       return str.length() > 10;
   }
}

// file MyJavaClass.java
class MyJavaClass {
   void example() {
       MyUtils.isBig("why?!");
       MyUtils.isBig("P90, RUSH B, ...");
   }
}