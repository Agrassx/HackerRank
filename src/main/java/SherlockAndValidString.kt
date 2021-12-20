import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'isValid' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun isValid(s: String): String {
    val charsArray = s.toCharArray()

    if (charsArray.size == 1) {
        return "YES"
    }

    val map = mutableMapOf<Char, Int>()

    charsArray.forEach {
        map[it] = map[it]?.plus(1) ?: 1
    }
    // {а: 1, b: 1, c: 3 }

    val countMap = mutableMapOf<Int, Int>()

    map.forEach { (char, count) ->
        countMap[count] = countMap[count]?.plus(1) ?: 1
    }
    // {1: 2, 3: 1}

    val max = countMap.keys.maxOrNull()!!

    val min = countMap.keys.minOrNull()!!

    return when {
        countMap.keys.count() == 1 -> "YES"
        countMap.keys.count() > 2 -> "NO"
        max - min > 1 && countMap[min]!! != 1 -> "NO"
        countMap[max] == 1 || countMap[min] == 1 -> "YES"
        else -> "NO"
    }
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = isValid(s)

    println(result)
}
