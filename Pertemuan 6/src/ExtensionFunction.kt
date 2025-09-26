fun String.greeting() : String{
    return "Wecome $this"
}

fun Int.isEven(): Boolean{
    return this % 2 == 0
}

fun main() {
    val userName : String = "Budi"
    val age : Int = 15
    println(userName.greeting())
    println(age.isEven())
}