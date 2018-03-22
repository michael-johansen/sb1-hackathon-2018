import org.junit.Test
import sb1.validation.toAccount
import kotlin.test.assertTrue

class TestToAccount {

    @Test fun testCid() {
        assertTrue(toAccount("12345678901"))
    }

}
