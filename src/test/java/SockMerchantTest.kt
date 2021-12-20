import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class SockMerchantTest {

    @Test
    fun sockMerchantTest7() {
        assertEquals(
            2,
            findSocks(7, arrayOf(1, 2, 1, 2, 1, 3, 2))
        )
    }

    @Test
    fun sockMerchantTest9() {
        assertEquals(
            3,
            findSocks(9, arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20))
        )
    }

    @Test
    fun sockMerchantTest10() {
        assertEquals(
            5,
            findSocks(10, arrayOf(1, 2, 2, 1, 1, 1, 1, 1, 2, 2))
        )
    }

}