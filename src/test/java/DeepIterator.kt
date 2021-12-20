// Input: [1, 2, 3, [4, 5, [6], 7], 8, 9]

class DeepIterator(
    private val list: List<*>,
) {

    private var currentIndex: Int = 0

    fun next(): Int? {
        val object1 : Any? = list[currentIndex]

        var value = 0

        if (object1 is Int) {
            value = object1
            currentIndex++
            return value
        }

        if (object1 is List<*>) {
            currentIndex++
            return DeepIterator(object1).next()
        }

        return value
    }

    fun hasNext(): Boolean {
        val object1 : Any? = list[currentIndex]

        if (object1 is Int) {
            return true
        }

        if (object1 is List<*>) {
            return DeepIterator(object1).hasNext()
        }

        return false
    }

    private class DeepIteratorInternal(
        private val parentIndex: Int,
        private val list: List<*>,
    ) {
        fun next(): Int? {

        }

        fun hasNext(): Boolean {

        }
    }
}

fun main() {

    val iterator = DeepIterator(
        listOf(1, 2, 3, listOf(4, 5, listOf(6), 7), 8, 9)
    )

    while (iterator.hasNext()) {
        print("${iterator.next()}, ")
    }

//     выведет 1, 2, 3, 4, 5, 6, 7, 8, 9
}
