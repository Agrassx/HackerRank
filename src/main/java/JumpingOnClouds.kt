import kotlin.collections.*
import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'jumpingOnClouds' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY c as parameter.
 */

// Egor
fun jumpingOnClouds(clouds: Array<Int>): Int {
    val thunderheadCloudType = 1

    var currentIndex = 0

    var stepCount = 0

    while (currentIndex <= clouds.size - 2) {

        val isNextCloudThunderhead = clouds[currentIndex + 1] == thunderheadCloudType

        if (currentIndex == clouds.size - 2) {
            return ++stepCount
        }

        val isThroughOneCloudThunderhead = clouds[currentIndex + 2] == thunderheadCloudType

        if (isNextCloudThunderhead) {
            stepCount++
            currentIndex += 2
            continue
        }

        if (isThroughOneCloudThunderhead) {
            stepCount++
            currentIndex += 1
            continue
        }

        currentIndex += 2
        stepCount++
    }

    return stepCount
}

//Anna
fun jumpingOnCloudsSecond(clouds: Array<Int>): Int {

    return 0
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    val result = jumpingOnClouds(c)

    println(result)
}
