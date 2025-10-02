fun tampilkanIsiArray(angka: IntArray) {
    print("Isi Array : ")
    for (i in angka) {
        print("$i ")
    }
}

fun hitungTotal(angka: IntArray): Int {
    var total = 0
    for (i in angka) {
        total += i
    }
    return total
}

fun hitungRataRata(angka: IntArray): Double {
    val total = hitungTotal(angka)
    return total.toDouble() / angka.size
}

fun main() {
    val angka = intArrayOf(90, 90, 100, 50)

    tampilkanIsiArray(angka)
    println()

    val total = hitungTotal(angka)
    val rataRata = hitungRataRata(angka)

    println("Total     : $total")
    println("Rata-rata : $rataRata")
}