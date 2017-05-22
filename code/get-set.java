void renderItem() {
    visitCount.setText(String.format(...), ...)
         
    if(item.cellPhone == null ||
       item.cellPhone.isEmpty()) {
        phone1.setVisibility(View.GONE)
    } else {
	  phone1.setVisibility(View.VISIBLE)
    }

    shopName.text = 
        item.name != null ? item.name : "..."
}