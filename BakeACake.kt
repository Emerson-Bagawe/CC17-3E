fun main() {
    val age = 20
    val layers = 20
    printCandles(age)
    printCakeTop(age)
    printCakeBottom(age, layers)
}

fun printCandles(age: Int) {
    repeat(age) {
        print(",")
    }
    println(" ")
    repeat(age) {
        print("|")
    }
    println()
}

fun printCakeTop(age: Int) {
    repeat(age) {
        print("=")
    }
    println()
}

fun printCakeBottom(age: Int, layers: Int) { 
    repeat(age) {
        print("@")
    }
    println()
    repeat(layers) {
        print("@")
    }
    println()
    repeat(layers) {
        print("@")
    }
    println()
    repeat(layers) {
        print("@")
    }
    println()
    repeat(layers) {
        print("@")
    }
}
