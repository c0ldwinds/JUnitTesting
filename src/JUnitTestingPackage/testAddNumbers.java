package JUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitFunction junit= new JUnitFunction();
		int result= junit.addNumbers(100,50);
		assertEquals(150,result);
		
	}

}
