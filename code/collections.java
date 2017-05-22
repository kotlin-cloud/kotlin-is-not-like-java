class MyUtils {
  static void example() {
    List&lt;String&gt; os = Arrays.asList("Android",
                   "iOS", null, "Windows Phone");
    List&lt;String&gt; osNotNull = new ArrayList&lt;&gt;();
    for (String name : os) {
      if (name != null) osNotNull.add(name);
    }
    Collections.sort(osNotNull, new
      Comparator&lt;String&gt;() { @Override
         public int compare(String l, String r) {
           return l.length() - r.length();
         }
    });
    for (String name : osNotNull) {
       String value = name.toUpperCase();
       print(value);
    }
}