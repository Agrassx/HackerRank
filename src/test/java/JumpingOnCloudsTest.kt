import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class JumpingOnCloudsTest {

    @Test
    fun jumpingOnClouds1() {
        val clouds = arrayOf(0, 0, 1, 0, 0, 1, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            4,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            4,
            jumpingOnCloudsSecond(clouds)
        )
    }

    @Test
    fun jumpingOnClouds2() {
        val clouds = arrayOf(0, 0, 0, 0, 1, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            3,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            3,
            jumpingOnCloudsSecond(clouds)
        )
    }

    @Test
    fun jumpingOnClouds3() {
        val clouds = arrayOf(0, 1, 0, 1, 0, 1, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            3,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            3,
            jumpingOnCloudsSecond(clouds)
        )
    }

    @Test
    fun jumpingOnClouds4() {
        val clouds = arrayOf(0, 0, 0, 0, 0, 0, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            3,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            3,
            jumpingOnCloudsSecond(clouds)
        )
    }

    @Test
    fun jumpingOnClouds5() {
        val clouds = arrayOf(0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            6,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            6,
            jumpingOnCloudsSecond(clouds)
        )
    }

    @Test
    fun jumpingOnClouds6() {
        val clouds = arrayOf(0, 0, 0, 1, 0, 0)

        println()
        println(clouds.toList())
        println()

        assertEquals(
            3,
            jumpingOnClouds(clouds)
        )

        assertEquals(
            3,
            jumpingOnCloudsSecond(clouds)
        )
    }

}