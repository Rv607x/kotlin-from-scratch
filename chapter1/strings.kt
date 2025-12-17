fun main() {
    println("")
    println("<------String Concatenation------->")
    concatenation()

    println("")
    println("<------String Templates------->")
    stringTemplates()
}

fun concatenation() {
    /* Concatenation is the process of combining two or more strings into a single
    string. */
    var a = "Hello"
    var b = "Word"
    println(a + " " + b)
    val c = buildString {
        append(a)
        append(", ")
        append(b)
    }
    println(c)
}

fun stringTemplates() {
    /* String templates allow you to embed code within a string
    String templates use the $ sign */
    val name = "John"
    val age = 30
    println("Name is $name and age is $age")
    val x = 20
    val y = 30
    println("$x + $y")
    println("${ x + y}")
}