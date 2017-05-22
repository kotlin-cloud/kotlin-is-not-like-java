class SomeHolder(var x: Int, val action: () -> Unit)

val sadHolder = SomeHolder(1) { print("I want to print x, but i don’t know how.") }

//modify the following line to let the magic happen
val happyHolder = SomeHolder(1) { print("I know what x is, it's $x")}