fun renderItem(item: SomeItem) {
    visitCount.text = "${item.visitCount}次拜访"

    phone1.visibility = 
            if(item.cellPhone.isNullOrEmpty()) 
               View.GONE else View.VISIBLE

    shopName.text = item.name ?: "暂无商户名称"
}