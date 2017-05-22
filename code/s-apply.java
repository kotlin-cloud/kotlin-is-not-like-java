File makeDir(String path) {
   File result = new File(path);
   result.mkdirs();
   return result;
}