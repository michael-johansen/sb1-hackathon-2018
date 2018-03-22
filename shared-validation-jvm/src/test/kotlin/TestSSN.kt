import org.junit.Test
import sb1.validation.ssnValidator
import kotlin.test.assertTrue

class TestSSN {

    private val validSSN = "02076043933"
    private val tooShortSSN = "0207604393"
    private val tooLongSSN = "020760439331"

    private val invalidSSN = "02076543933"

    @Test fun testTooShort() {
        assertTrue(ssnValidator(tooShortSSN).isNotEmpty())
    }

    @Test fun testTooLong() {
        assertTrue(ssnValidator(tooLongSSN).isNotEmpty())
    }


    @Test fun testMod11() {
        assertTrue(ssnValidator(validSSN).isEmpty())
    }

    @Test fun testMod11invalid() {
        assertTrue(ssnValidator(invalidSSN).isNotEmpty())
    }
}
