

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SumTest {

	@Test
	public void test() {
		JUnitTest test = new JUnitTest();
		assertEquals(6, test.sum(2, 3));
	}
	

}
