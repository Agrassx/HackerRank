import kotlin.collections.*

/*
 * Complete the 'repeatedString' function below.
 *
 * The function is expected to return a LONG_INTEGER.
 * The function accepts following parameters:
 *  1. STRING s
 *  2. LONG_INTEGER n
 */

// Egor
fun repeatedString(s: String, n: Long): Long {
    when {
        n > 1_000_000_000_000L -> return 0L
        n < 1L -> return 0L
    }

    val charArray = s.toCharArray()

    val charA = 'a'

    if (charArray.contains(charA).not()) {
        return 0L
    }

    val charsCount = charArray.size.toLong()

    when {
        charsCount < 1L -> return 0L

        charsCount > 100L -> return 0L

        charsCount == 1L -> return n

        charsCount == 2L ->
            return if (n % charsCount == 0L) {
                n / 2
            } else {
                n / 2 + 1
            }
    }

    fun calculateCharsRepeats(
        charArray: CharArray,
        fullRepeatCount: Long = 0,
        extraCharsCount: Int = 0
    ): Long {
        var countOfCharA = 0L

        if (fullRepeatCount >= 1) {
            countOfCharA = (charArray.count { it == charA } * fullRepeatCount)
        }

        if (extraCharsCount == 0) {
            return countOfCharA
        }

        charArray.forEachIndexed { index: Int, char: Char ->
            if (char == charA) {
                countOfCharA++
            }

            if (index == extraCharsCount - 1) {
                return countOfCharA
            }
        }

        return countOfCharA
    }

    if (n > charsCount) {
        val fullRepeatCount = n / charsCount

        val extraCharsCount = (n % charsCount).toInt()

        return calculateCharsRepeats(
            charArray = charArray,
            fullRepeatCount = fullRepeatCount,
            extraCharsCount = extraCharsCount
        )
    }

    return calculateCharsRepeats(
        charArray = charArray,
        fullRepeatCount = 0,
        extraCharsCount = n.toInt()
    )
}

// Anna
fun repeatedStringSecond(s: String, n: Long): Long {

    return 0
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val n = readLine()!!.trim().toLong()

    val result = repeatedString(s, n)

    println(result)
}
