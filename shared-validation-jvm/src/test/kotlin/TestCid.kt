import org.junit.Test
import sb1.validation.cid
import kotlin.test.assertTrue

class TestCid {

    @Test fun testCid() {
        assertTrue(cid("12345678901"))
    }

}
