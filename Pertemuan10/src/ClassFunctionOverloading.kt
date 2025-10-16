package OOP

class MahasiswaFunctionOverloading (val nama : String){
    fun sayHello(){
        println("Selamat malam $nama")
    }

    fun sayHello(word : String){
        println("$word $nama")
    }
}

fun main() {
    val mahasiswaPertama = MahasiswaFunctionOverloading("Reni Aurelia")
    mahasiswaPertama.sayHello()
    mahasiswaPertama.sayHello("Selamat Pagi")
}