import org.junit.Test
import sb1.validation.ssn
import kotlin.test.assertEquals
import kotlin.test.assertNotEquals

class TestSSN {

    private val validSSN = "02076043933"
    private val tooShortSSN = "0207604393"
    private val tooLongSSN = "020760439331"

    private val invalidSSN = "02076543933"

    @Test fun testTooShort() {
        assertNotEquals("", ssn(tooShortSSN))
    }

    @Test fun testTooLong() {
        assertNotEquals("", ssn(tooLongSSN))
    }


    @Test fun testMod11() {
        assertEquals("", ssn(validSSN))
    }

    @Test fun testMod11invalid() {
        assertNotEquals("", ssn(invalidSSN))
    }
}
