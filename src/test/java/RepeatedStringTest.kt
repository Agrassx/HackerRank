import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class RepeatedStringTest {

    @Test
    fun repeatedString1() {
        val string = "abcac"
        val numberOfCharactersToConsider = 10L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            4L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString2() {
        val string = "aba"
        val numberOfCharactersToConsider = 10L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            7L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            7L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString3() {
        val string = "a"
        val numberOfCharactersToConsider = 1_000_000L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            1_000_000L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            1_000_000L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString4() {
        val string = "ab"
        val numberOfCharactersToConsider = 1_000_000L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            500_000L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            500_000L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString5() {
        val string = "abcac"
        val numberOfCharactersToConsider = 10L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            4L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString6() {
        val string = "ab"
        val numberOfCharactersToConsider = 999_999L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            500_000L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString7() {
        val string = "saaaassss"
        val numberOfCharactersToConsider = 23L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            12L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString8() {
        val string = "d"
        val numberOfCharactersToConsider = 12523025L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            0L,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

    @Test
    fun repeatedString9() {
        val string = "cfimaakj"
        val numberOfCharactersToConsider = 554045874191L

        println()
        println("String = [$string]  the number of characters to consider = $numberOfCharactersToConsider")
        println()

        assertEquals(
            138511468548,
            repeatedString(
                string,
                numberOfCharactersToConsider,
            )
        )

        assertEquals(
            4L,
            repeatedStringSecond(
                string,
                numberOfCharactersToConsider,
            )
        )
    }

}