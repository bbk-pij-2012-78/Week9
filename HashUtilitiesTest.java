import org.junit.*;
import static org.junit.Assert.*;
import java.util.Random;

public class HashUtilitiesTest {
	@Test
	public void testsShortHash() {
		Random rdm = new Random(System.currentTimeMillis());
		HashUtilities hu = new HashUtilities();
		int result = 0;

		for (int x = 0; x <= 2000; x++) {
			result = hu.shortHash(rdm.nextInt());
			assertTrue(result >= 0 && result <= 1000);
		}
	}
}