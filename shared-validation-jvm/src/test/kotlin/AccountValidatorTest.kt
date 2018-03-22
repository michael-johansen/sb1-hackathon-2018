
import org.junit.Test
import sb1.validation.accountValidator
import kotlin.test.assertTrue

class AccountValidatorTest {

    @Test fun `test that account validator has correct length`() {
        assertTrue(accountValidator("12345").isNotEmpty())
    }
}