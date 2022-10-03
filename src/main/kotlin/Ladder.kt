import kotlin.math.*

fun main() {
    val input = readLine()!!.split(" ").map {it.toDouble()}
    val height = input[0]
    val angle = input[1] * (PI / 180)

    var num = ceil(height / sin(angle)).toInt()
    println(num)
}