var a = 20
val b = 21.5
var c = 30

fun main(){
    var sum = a + b
    println(sum)

    var multiplication =  a * c
    println(multiplication)

    var division = c / a
    println(division)

    println("")
    println("<-------Variable Assignement--------->")
    // variable assignement 
    a += 5
    println(a) 
    a -= 5
    println(a)
    a *= 5
    println(a) 
    a /= 5
    println(a) 
    var s = "John"
    s += "te"
    println(s)
    
    println("")
    println("<------Unary Operators------->")
    /* unary operator increment (++) and decrement (--) unary operators increase or 
    decrease a variable’s value by 1
    */
    
    var x = 10
    x++
    println(x)
    x--
    println(x)
}