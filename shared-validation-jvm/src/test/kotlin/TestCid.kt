import org.junit.Test
import sb1.validation.cid
import kotlin.test.assertEquals

class TestCid {

    private val validCID = "12345678903"
    private val invalidCID = "12345768903"

    @Test fun testMod11() {
        assertEquals("", cid(validCID))
    }

    @Test fun testMod11invalid() {
        assertEquals("", cid(invalidCID))
    }

}
