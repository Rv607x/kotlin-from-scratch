/* 
variables innitialized with var keyword are mutable
hence can have their values changed 
Variables innitialised with "val" are immutable and their 
values cannot be changed
 */

var name = "Johnte"
val age = 20


fun main() {
    println("The name is $name and they are $age years old")
    trial()
}

fun trial() {
    var name = "Cheryl"
    val age = 34
    println("The name is $name and they are $age years old")
}