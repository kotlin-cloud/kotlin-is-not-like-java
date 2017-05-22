class MyJavaClass {
   final String getName() {
       return "Omar";
   }

   final String getSurname() {
       return "Miatello";
   }

   final String getExample() {
       return String.format("My name is %s %s",
           getName(), getSurname()); }
}