fun example() {
   val os = listOf("Android", "iOS", null,
                   "Windows Phone")

   os.filterNotNull().sortedBy { it.length }
           .map { it.toUpperCase() }
           .forEach { print(it) }

}