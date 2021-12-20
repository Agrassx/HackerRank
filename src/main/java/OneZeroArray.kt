// На вход подается массив char  101111111111001
// Давайте напишем функцию которая максимально оптимально вернет тот же набор, только
// все единички сдвинуты влево 1111111111000

fun moveOneToLeft(charArray: CharArray): CharArray {

    val one = '1'
    val zero = '0'

    fun swap(charArray: CharArray, fromIndexPosition: Int, toIndexPosition: Int) {
        val a = charArray[fromIndexPosition]

        val b = charArray[toIndexPosition]

        charArray[fromIndexPosition] = b

        charArray[toIndexPosition] = a
    }

    var indexCount = 0

    for (i in 0 until charArray.size - 1) {


        when {
            charArray[i] == one && indexCount == 0 ->
                continue

            charArray[i] == zero && charArray[i + 1] == one ->
                swap(charArray, i, i + 1)

            charArray[i] == zero && charArray[i + 1] == zero -> {
                indexCount++
                continue
            }

            charArray[i] == one && indexCount != 0 -> {
                swap(charArray, i, i - indexCount)
                indexCount = 0
                continue
            }
        }

    }

    return charArray

}