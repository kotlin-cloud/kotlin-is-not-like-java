fun Activity.call(phone: String?) {
   phone?.let {
       if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) 
           == PackageManager.PERMISSION_GRANTED) {
           val callIntent = Intent(Intent.ACTION_DIAL)
           callIntent.data = Uri.parse("tel:" + it)
           this.startActivity(callIntent)
       } else {
           ActivityCompat.requestPermissions(this,
                   arrayOf(Manifest.permission.CALL_PHONE),
                   StaticConfig.RequestCode.REQUEST_PHONE)
           toast("请确认是否开启拨打电话权限")
       }
   }
   if (phone == null) {
       toast("没有电话！")
   }
}