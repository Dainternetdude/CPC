import kotlin.math.ceil

fun main() {

    val input = readLine()!!.toInt()

    var min = input

    for (i in 1 .. input) {
        var printers = Math.pow(2.0, i.toDouble())
        var rounds = ceil(input / printers).toInt() + i

        if (rounds < min) min = rounds
    }

    println(min)
}

/*
1: printers = 2;    rounds = ceil(input / printers)
2: printers = 4;
3: printers = 8;
4: printers = 16;
5: printers = 32;
 */