import java.lang.Integer.min

fun main() {

    var input = readLine()
    var tabletCards = 0
    var compassCards = 0
    var gearCards = 0

    input!!.forEach {
        when (it) {
            'T' -> tabletCards++
            'C' -> compassCards++
            'G' -> gearCards++
        }
    }

    var total = tabletCards * tabletCards
    total += compassCards * compassCards
    total += gearCards * gearCards

    total += min(min(tabletCards, compassCards), gearCards) * 7

    println(total)
}