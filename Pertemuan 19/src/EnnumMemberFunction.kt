enum class DayOfTheWeek3(val isWeekend : Boolean) {
    Senin(isWeekend = false),
    Selasa(isWeekend = false),
    Rabu(isWeekend = false),
    Kamis(isWeekend = false),
    Jumat(isWeekend = false),
    Sabtu(isWeekend = true),
    Minggu(isWeekend = true);

    fun daysUntil(targetHari: DayOfTheWeek3): Int {
        return if(this.ordinal < targetHari.ordinal){
            targetHari.ordinal - this.ordinal
        }else{
            
        }

    }
}

fun main() {
    val today = DayOfTheWeek3.Jumat
    val targetHari = DayOfTheWeek3.Senin

    val sisaHari = today.daysUntil(targetHari)
    println(sisaHari)

    println(DayOfTheWeek3.today())
}