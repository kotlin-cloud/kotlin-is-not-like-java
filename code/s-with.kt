fun Activity.toast(str: String) {
    Toast.makeText(this, str, Toast.LENGTH_SHORT).show()
}

visitList.setOnClickListener {
    with(context as Activity) {
        toast("haha")
    }
}