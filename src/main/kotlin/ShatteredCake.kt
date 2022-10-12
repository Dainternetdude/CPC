fun main() {
    val width = readLine()!!.toInt()
    val numberOfPieces = readLine()!!.toInt()
    val pieces = Array<Piece?>(numberOfPieces) { null }
    for (i in 1..numberOfPieces) {
        val (w, l) = readLine()!!.split(" ").map { it.toInt() }
        pieces[i-1] = Piece(w, l)
    }

    var totalArea = 0
    for (i in 1..numberOfPieces) {
        totalArea += pieces[i-1]!!.area
    }

    println(totalArea / width)
}

class Piece(val width: Int, val length: Int) {
    val area get() = width * length
}