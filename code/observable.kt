class User {
    var name: String by Delegates.observable("<no name>") {
        prop, old, new ->
        println("$old -> $new")
    }
}

fun example() {
    val user = User()
    user.name = "first"     //<no name> -> first
    user.name = "second"    //first -> second
}