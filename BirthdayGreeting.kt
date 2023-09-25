fun main() {
    val age = 20*365
    val name="Ems"
    val border="===%%%"
    val timesToRepeat = 3
    
    printBorder(border, timesToRepeat)
    println("Happy Birthday ${name}")
    printBorder(border, timesToRepeat)
    print("\nI am ${age} days old")
    print("\n${age} days old is the best age to learn Kotlin!\n")
    //Let's Print a Cake
    //Wala na Cake ko kinain na
    println("")
    println("${name} is already ${age} days old")
}

fun printBorder (border:String,timesToRepeat:Int){
    repeat(timesToRepeat){
        print(border)
    }
    println("")
}