import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CountingValleysTest {

    @Test
    fun countingValleysTest1() {
        val way = """
            _ /\      _
                \    /
                 \/\/
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            1,
            countingValleys(8, "UDDDUDUU")
        )

        assertEquals(
            1,
            countingValleys("UDDDUDUU")
        )
    }

    @Test
    fun countingValleysTest2() {
        val way = """
               /\      /\
            _ /  \    /  \_
                  \/\/
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            2,
            countingValleys(11, "UUDDDUDUUDD")
        )

        assertEquals(
            2,
            countingValleys("UUDDDUDUUDD")
        )
    }

    @Test
    fun countingValleysTest3() {
        val way = """
               _/\_
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            0,
            countingValleys(2, "UD")
        )
        assertEquals(
            0,
            countingValleys("UD")
        )

    }

    @Test
    fun countingValleysTest4() {
        val way = """
               _/\  _
                  \/
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            1,
            countingValleys(4, "UDDU")
        )

        assertEquals(
            0,
            countingValleys("UD")
        )
    }

    @Test
    fun countingValleysTest5() {
        val way = """
            _     /\_
              \  /    
               \/ 
            
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            1,
            countingValleys(6, "DDUUUD")
        )

        assertEquals(
            1,
            countingValleys("DDUUUD")
        )
    }

    @Test
    fun countingValleysTest6() {
        val way = """
            _           /\_
              \  /\    /
               \/  \/\/
            
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            2,
            countingValleys(12, "DDUUDDUDUUUD")
        )

        assertEquals(
            2,
            countingValleys("DDUUDDUDUUUD")
        )
    }

    @Test
    fun countingValleysTest7() {
        val way = """
               _   _
                 \/
        """.trimIndent()

        println()
        println("------------------------------------")
        println(way)
        println("------------------------------------")

        assertEquals(
            1,
            countingValleys(2, "DU")
        )

        assertEquals(
            1,
            countingValleys("DU")
        )
    }
}