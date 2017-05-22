class MyActivity extends Activity {
   //leave out 
   Api baiduService = HttpService.getApiService(Api.class);

   void test() {
      ToastUtil.showToast(this, "hahaha");
   }
}