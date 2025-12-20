fun main() {
    ifCondition()
    ifElse()
    elseIf()
    whenCondition()
    whenCondition2()
}

fun ifCondition() {
    var x = 10
    if(x > 0) println("x is positive")
}

fun ifElse() {
    val y = -100
    if (y > 0) {
        println("y is positive")
    } else {
        println("y is not positive")
    }
}

fun elseIf() {
    val a = 300
    val b = 300
    val max: Int

    if (a > b) {
        max = a
        println("a is greater than b")
        println("Max of a and b is: $max")
    }
    else if (a < b) {
        max = b
        println("b is greater than a")
        println("Max of and b is: $max")
    }
    else
    println("a and b have same value: $a")
}

fun whenCondition() {
    val x = 8

    when {
        x > 0 -> println("x is a positive int")
        x == 0 -> println("x is zero")
        x < 0 -> println("x is negative")
        else -> println("x is not a real number")
    }
}

fun whenCondition2() {
    val hour = 19

    when (hour) {
        in 0..11 -> println("Good Morning")
        in 12..16 -> println("Good afternoon")
        in 17..23 -> println("Good Evening")
        else -> println("Invalid hour")
    }
}