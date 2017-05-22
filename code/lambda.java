public class SomeJavaClass {

   interface Addable {
       int add(int a, int b);
   }

   static int add2(int a, int b, Addable addable) {
       if (a > b) {
           return addable.add(a, b);
       } else {
           return a - b;
       }
   }

   void test() {
       System.out.println(add2(2, 1, new Addable() {
           @Override
           public int add(int a, int b) {
               return a + b;
           }
       }));
   }
}