fun main() {
    val N = readLine()!!.toInt()
    val A = readLine()!!.split(" ").map {it.toInt()}

    var gis = ArrayList<Int>()
    gis.add(A[0])

    for (i in 1 until N) {
        var n = gis.last()
        var found = false

        A.forEach {
            if (!found && it > n) { gis.add(it); found = true }
        }
        if (!found) break
    }

    var GIS = StringBuilder()
    gis.forEach { GIS.append(it); GIS.append(" ") }
    GIS.removeSuffix(" ")
    println(gis.size)
    println(GIS)
}
