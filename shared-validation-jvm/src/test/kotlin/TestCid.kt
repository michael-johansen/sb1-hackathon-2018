import org.junit.Test
import sb1.validation.cidValidator
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class TestCid {

    private val validCID = "12345678903"
    private val invalidCID = "12345768903"

    @Test fun testMod11() {
        assertTrue(cidValidator(validCID).isEmpty())
    }

    @Test fun testMod11invalid() {
        assertTrue(cidValidator(invalidCID).isNotEmpty())
    }

}
