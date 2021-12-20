import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class StringManipulationTest {

    @Test
    fun makeAnagram1() {
        val a = "cde"
        val b = "dcf"

        assertEquals(
            2,
            makeAnagram(a, b)
        )
    }

    @Test
    fun makeAnagram2() {
        val a = "cde"
        val b = "abc"

        assertEquals(
            4,
            makeAnagram(a, b)
        )
    }

    @Test
    fun makeAnagram3() {
        val a = "fcrxzwscanmligyxyvym"
        val b = "jxwtrhvujlmrpdoqbisbwhmgpmeoke"

        assertEquals(
            30,
            makeAnagram(a, b)
        )
    }

    @Test
    fun makeAnagram4() {
        val a = "showman"
        val b = "woman"

        assertEquals(
            2,
            makeAnagram(a, b)
        )
    }

}
