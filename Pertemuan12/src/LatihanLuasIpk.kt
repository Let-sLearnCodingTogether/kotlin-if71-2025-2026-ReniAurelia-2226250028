package oop

class  LuasPersegiPanjang(val panjang: Double, val lebar : Double){
    val luas : Double
        get() = panjang * lebar
}

class Mahasiswa(ipk : Double) {
    var ipk : Double = ipk
        set(ipk) {
            field = if (ipk < 0) 0.0
            else if (ipk > 4) 4.0
            else ipk
        }

    init {
        this.ipk = ipk
    }
}

fun main() {
    val hasilAkhir = LuasPersegiPanjang(4.0, 2.0)
    println(hasilAkhir.luas)

    val ipkMahasiswa = Mahasiswa(8.5)
    println(ipkMahasiswa.ipk)
}