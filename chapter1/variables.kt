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
    println("----- Type infering--------")
    trial2()
}

fun trial() {
    var name = "Cheryl"
    val age = 34
    println("The name is $name and they are $age years old")
}

//infering of variable type 

fun trial2() {
    val name: String = "Johnte"
    val pi: Double = 3.142
    val dob: Int = 31
    println("Name is $name and they were born on $dob")
    println("The value of pi is $pi")
}