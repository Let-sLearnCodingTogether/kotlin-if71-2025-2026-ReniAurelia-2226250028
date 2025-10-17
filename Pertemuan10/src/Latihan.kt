// Membuat data class GameItem
data class GameItem(
    val id: Int,
    val name: String,
    val value: Int,
    val rarity: String
)

fun main() {
    // a. Membuat List untuk menampung objek GameItem
    val inventory = mutableListOf<GameItem>()

    // b. Membuat 3 objek GameItem berbeda dan menambahkannya ke List
    val item1 = GameItem(1, "Pedang Besi", 100, "Common")
    val item2 = GameItem(2, "Ramuan Kesehatan", 50, "Common")
    val item3 = GameItem(3, "Jubah Bayangan", 500, "Epic")

    inventory.addAll(listOf(item1, item2, item3))

    // c. Membuat versi terkutuk dari Pedang Besi menggunakan fungsi copy()
    val cursedSword = item1.copy(name = "Pedang Besi Terkutuk", value = 250)

    // d. Mencetak hasil ke konsol
    println("Objek Pedang Besi asli: $item1")
    println("Objek Pedang Besi Terkutuk: $cursedSword")

    // Menampilkan seluruh isi inventaris
    println("\nIsi Inventaris:")
    inventory.forEach { println(it) }
}