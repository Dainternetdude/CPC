fun main(){val a =readLine()!!.split(" ").map{it.toInt()};(if(a[0]<a[1])a[0]+1..a[1]+1 else a[1]+1..a[0]+1).map{println(it)}}