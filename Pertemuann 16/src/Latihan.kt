package nextOOP

open class Pegawai (val nama : String, val gajiDasar : Int){
    open fun hitungGaji(){
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

class Manager(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar){
    override fun hitungGaji() {
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

class Programmer(nama: String, gajiDasar: Int) : Pegawai(nama, gajiDasar){
    override fun hitungGaji() {
        println("Gaji dasar adalah Rp.$gajiDasar")
    }
}

fun main() {
    val pegawai = Manager("Reni", 1000000)
    pegawai.hitungGaji()

    val pegawai2 = Programmer("Reniiiii", 100005600)
    pegawai2.hitungGaji()

    println()

    val semuaPegawai : MutableList <Pegawai> = mutableListOf(
        Programmer("Reniiiii", 99000000),
        Manager("Nyimas", 5000000),
        Manager("William", 40000000)
    )
    semuaPegawai.forEach {
        it.hitungGaji()
    }
}