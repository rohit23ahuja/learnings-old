
package java.learning.enums;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class EnumInIfStatementTest {
	private EnumInIfStatement enumInIfStatement;

	@Before
	public void setUp() {
		enumInIfStatement = new EnumInIfStatement();
	}

	@After
	public void tearDown() {
		enumInIfStatement = null;
	}

	@Test
	public void enumInIfTest() {
		Days day = Days.SUNDAY;
		String result = enumInIfStatement.enumInIf(day);
		assertEquals(result, "Its Sunday :-)");
	}
}
 