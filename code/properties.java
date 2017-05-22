public class MyJavaClass {
   private final int a = 1;
   private int b = 1;
   private final int c = 1;
   private int d = 1;

   public int getA() { return a; }
   public int getB() { return b; }
   public void setB(int b) { this.b = b; }
   public int getC() { return c; }
   public int getD() { return d; }
   private void setD(int d) { this.d = d; }
}

class ExampleClass {
   public static void example() {
      MyJavaClass myClass = new MyJavaClass()
      myClass.setB(2)
   }
}