package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitFunction junit= new JUnitFunction();
		String result= junit.addStrings("ABC","DEF");
		assertEquals("ABCDEF",result);
	}

}
