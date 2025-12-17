fun main() {
    println("")
    println("<------String Concatenation------->")
    concatenation()

    println("")
    println("<------String Templates------->")
    stringTemplates()

    println("")
    println("<------String Escape Sequences------->")
    escapeSequences()
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

fun escapeSequences() {
    /* the escape sequence \n represents a newline character, 
    and \t represents a tab character. */
    println("John is a way too common name \nto not know it as a christian")
    println("Here is a sample of \t a tabbed string")
}