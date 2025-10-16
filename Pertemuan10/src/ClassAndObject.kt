package OOP

class MahasiswaConstructorDefaultValue (
    val npm : String,
    val nama : String,
    var ipk : Float = 0.0f
){
    init {
        println("Ini block Inir")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaConstructorDefaultValue(
        "2226250028",
        "Reni Aurelia"
    )

    println(mahasiswaPertama.ipk)

    val mahasiswaKedua = MahasiswaConstructorDefaultValue (
        "2226250028",
        "Reni Aurelia",
        3.9f
    )
    println(mahasiswaKedua.ipk)
}