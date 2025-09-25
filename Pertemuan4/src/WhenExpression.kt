fun main() {
    val finalExam = 'A'
    var finalExam1 = 0.00

    when(finalExam) {
        'A' -> println("Lulus")
        'B' -> println("Lulus juga")
        'C' -> println("Ya bisa lulus")
        else -> println("Tidak Lulus")
    }

    when(finalExam) {
        'A', 'B' -> println("Lulus")
        'C' -> println("Ya bisa lulus")
        else -> {
            println("Tidak Lulus")
        }
    }

    when{
        finalExam1 == 0.00 || finalExam1 < 5 -> finalExam1 = 10.0
    }
    println(finalExam1)

//    var status = false
//    when (finalExam){
//        'A', 'B' -> true
//        else -> false
//    }
//    println(status)

    var status = when(finalExam){
        'A', 'B' -> true
        else -> false
    }
    println(status)

    val nilaiLulus = arrayOf('A', 'B')
    when(finalExam){
        in nilaiLulus -> println("Lulus")
        !in nilaiLulus -> println("Tidak lulus")
    }

    when(finalExam){
        is Char -> println("ya, ini char")
        is String -> println("Ini string")
        is Char -> print("bukan char")
    }
}