fun calculate(
    tugas1 : Double,tugas2 : Double, kuis1: Double, kuis2 : Double, uts : Double, uas : Double
){
    println(" sum ${tugas1 + tugas2 + kuis1 + kuis2 + uts + uas}")
}

fun main() {
    calculate(kuis1 = 10.6, uts = 100.0, uas = 100.0, tugas1 = 10.0, tugas2 = 10.0, kuis2 = 20.6)
}