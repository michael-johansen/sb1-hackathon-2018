import sb1.validation.toAccount
import kotlin.test.Test
import kotlin.test.assertTrue

class TestToAccount {
    @Test
    fun testToAccount() = assertTrue("toAccountShouldBeValid") { toAccount("11111111111") }
}
