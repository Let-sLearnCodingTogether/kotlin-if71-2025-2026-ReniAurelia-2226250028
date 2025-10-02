fun main() {
    val users : Array<String> = arrayOf("User 1", "User 2")

    users.forEach {
        println("Forech : $it")
    }

    users.forEach { user ->
        println("Forech2 : $user")
    }

    users.forEachIndexed { index, user ->
        println("Foreach Index : ${index+1} :$user")
    }
}