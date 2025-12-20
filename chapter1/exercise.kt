/* 
Create a program that determines a user’s eligibility to vote based on their age.
Follow these steps to complete the exercise: 

Prompt the user to enter their age as an integer. As we’ll discuss in “Basic
Input and Output” on page 37, this can be done as follows:
println("Enter your age:")
val age = readln()

*/

fun main() {
    ifElseImplementation()
    println("..........")
    println("")
    whenImplementation()
}

fun ifElseImplementation() {
    println("Whats your age:")
    val age: Int = readln().toInt()
    if (age < 18) {
        println("You are not eligible to vote yet")
    }
    else if (age > 120) {
        println("Hello Fossil, kindly input a valid age")
    }
    else
    println("Hurray, you are eligible to vote out for wantam")
}

fun whenImplementation() {
    println("Input your age:")
    val age: Int = readln().toInt()
    
    when (age) {
        in 0..17 -> println("Sorry Kiddo, too young to vote")
        in 18..120 -> println("Hurray let's go vote out wantam")
        else -> println("Sorry fossil, please input a valid age or show your vampire card 😉")
    }
    
}