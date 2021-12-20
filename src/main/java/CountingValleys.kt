/*
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */
// Egor
val UP: Char = 'U'

fun countingValleys(steps: Int, path: String): Int {
    val up = 'U'

    val down = 'D'

    var isPreviousStepBellowSeaLevel = false

    var currentSeaLevel = 0

    var valleyCount = 0

    path.toCharArray()
        .forEach {
            when (it) {
                up -> currentSeaLevel++
                down -> currentSeaLevel--
            }

            if (isPreviousStepBellowSeaLevel && currentSeaLevel == 0) {
                valleyCount++
            }

            isPreviousStepBellowSeaLevel = currentSeaLevel < 0
        }

    return valleyCount
}

fun countingValleys(path: String): Int {
    var count = 0
    var dolina = 0

    path.toCharArray().forEach {

        if (count < 0) {

            count = changeCount(it, count)

            if (count == 0) {
                dolina += 1
            }
        } else {

            count = changeCount(it, count)

        }
    }

    return dolina
}

private fun changeCount(char: Char, count: Int): Int =
    if (char == UP) {
        count + 1
    } else {
        count - 1
    }

fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}
