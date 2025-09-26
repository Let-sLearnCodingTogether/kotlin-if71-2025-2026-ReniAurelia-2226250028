fun main() {
    //null
    var student : String = "Budi"
    println(student)

    //student = null

    var prodiIf : String? = "IF"
    println(prodiIf?.length)

    var prodiIf1 : String? = null
    println(prodiIf1?.length)

    var prodiSi : String? = null
    println(prodiSi ?: "Tanpa Prodi")

    var token : String? = null
    println(token!!.length)

    val email : String? = "email"
    if(email != null){
        print(email.length)
    }
}