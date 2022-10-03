fun main() {
    val cost: Float = readLine()!!.toFloat()
    val numberOfLawns: Int = readLine()!!.toInt()
    var width = FloatArray(numberOfLawns)
    var length = FloatArray(numberOfLawns)
    for (i in 0 until numberOfLawns) {
        val wh = readLine()!!.split(" ").map { it.toFloat() }
        width[i] = wh[0]
        length[i] = wh[1]
    }

    var total = 0.0F
    for (i in 0 until numberOfLawns) {
        total += cost * width[i] * length[i]
    }

    println(total)
}