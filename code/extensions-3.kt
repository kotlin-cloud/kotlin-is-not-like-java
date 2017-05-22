inline fun Array<String>.asPermissions(activity: Activity, fn: () -> Unit) {
   checkNotNull(activity)
   val PERMISSION_REQUEST_CODE = 11111
   var pred = true
   if (android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
       this.filter { ActivityCompat.checkSelfPermission(activity, it) != PackageManager.PERMISSION_GRANTED }
               .forEach { pred = false }
   }
   if (pred) {
       fn()
   } else {
       ActivityCompat.requestPermissions(activity, this, PERMISSION_REQUEST_CODE)
   }
}

fun test(activity: Activity) {
   listOf(Manifest.permission.ACCESS_FINE_LOCATION,
           Manifest.permission.ACCESS_COARSE_LOCATION,
           Manifest.permission.READ_PHONE_STATE).asPermissions(activity) {
       // do things with required permissions
   }
}