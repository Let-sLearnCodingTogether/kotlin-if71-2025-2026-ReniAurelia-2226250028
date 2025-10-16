package OOP

class MahasiswaThisKeyword(val nama : String){
    fun sayGoodbye(nama : String){
        println("$nama : ${this.nama}")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaThisKeyword(
        "Reni Aurelia"
    )

    mahasiswaPertama.sayGoodbye("Reni Aurelia")
}