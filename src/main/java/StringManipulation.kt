import kotlin.collections.*
import kotlin.io.*
import kotlin.math.abs
import kotlin.text.*

/*
 * Complete the 'makeAnagram' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. STRING a
 *  2. STRING b
 */

fun makeAnagram(a: String, b: String): Int {
    val sortedA = a.toCharArray()

    val sortedB = b.toCharArray()

    return if (sortedA.size < sortedB.size) {
        find(shorterArray = sortedA, longerArray = sortedB)
    } else {
        find(shorterArray = sortedB, longerArray = sortedA)
    }
}

private fun find(shorterArray: CharArray, longerArray: CharArray): Int {
    val map = hashMapOf<Char, Int>()

    longerArray.forEach {
        map[it] = (map[it]?.plus(1)) ?: 1
    }

    shorterArray.forEach {
        map[it] = (map[it]?.minus(1)) ?: -1
    }

    return map.values.sumBy { Math.abs(it) }
}

fun main(args: Array<String>) {
    val a = readLine()!!

    val b = readLine()!!

    val res = makeAnagram(a, b)

    println(res)
}
