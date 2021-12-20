/*
* Complete the 'sockMerchant' function below.
*
* The function is expected to return an INTEGER.
* The function accepts following parameters:
*  1. INTEGER n
*  2. INTEGER_ARRAY ar
*/

//Egor
fun sockMerchant(n: Int, ar: Array<Int>): Int {

    val map = HashMap<Int, Int>()

    var pairs = 0

    ar.forEach {
        map[it] =
            if (map[it] == null) {
                1
            } else {
                map[it]!! + 1
            }

        if (map[it] == 2) {
            pairs++
            map[it] = 0
        }
    }

    return pairs
}

//Anna
fun findSocks(n: Int, ar: Array<Int>): Int {

    var array = hashMapOf<Int, Int>()

    ar.forEach { int: Int ->
        if (array[int] == null) {
            array.put(int, 1)
        } else {
            array[int] = array[int]!!.plus(1)
        }
    }

    var result = 0
    array.forEach { result += it.value / 2 }

    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()

    val result = sockMerchant(n, ar)

    println(result)
}
