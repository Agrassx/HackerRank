import java.math.BigInteger
import java.util.concurrent.Callable
import java.util.concurrent.Executors

fun test(a: LongArray, threadCount: Int): () -> BigInteger {
    val splitedArrayList = splitArray(a, threadCount)

    val runnableList =
        splitedArrayList
            .map {
                Callable {
                    val localSum = BigInteger.valueOf(it.sum())
                    localSum
                }
            }

    val threadPullExecutor = Executors.newFixedThreadPool(threadCount)

    val featureList = threadPullExecutor.invokeAll(runnableList)

    return {
        featureList.sumOf {
            it.get()
        }
    }

}

fun splitArray(array: LongArray, subArrayCount: Int): List<LongArray> {
    val itemCount = array.size / subArrayCount

    val extraElementCount = itemCount % subArrayCount

    val arrayList =
        (0 until subArrayCount)
            .mapIndexed { index, _ ->
                val fromIndex = index * itemCount

                var toIndex = fromIndex + itemCount

                if (index == (subArrayCount - 1)) {
                    toIndex += extraElementCount
                }

                array.copyOfRange(
                    fromIndex = fromIndex,
                    toIndex = toIndex,
                )
            }

    return arrayList
}

inline fun runWithBanchmark(action: () -> Unit) {
    val currentTime = System.currentTimeMillis()

    action()

    val afterAlghoritmWork = System.currentTimeMillis()

    println("Work time = [${(afterAlghoritmWork - currentTime)}] ms")
}

fun main() {
    (1..8).map {
        runWithBanchmark {
            println("Thread count = [$it]")
            test((0..1_000_000).map { it.toLong() }.toLongArray(), it)()
        }
    }

    val sum = BigInteger.valueOf(
        (0..1_000_000).map { it.toLong() }.toList().sum()
    )

}