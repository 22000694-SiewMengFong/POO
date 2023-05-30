import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 4321;
		int b = 1234;

		Calculator cal = new Calculator();
		int actual = cal.add(a, b);

		int expected = 5555;
		assertEquals(expected, actual);
	}

	@Test
	public void testSubtract() {
		int a = 1000;
		int b = 301;

		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);

		int expected = 699;
		assertEquals(expected, actual);
	}

	@Test
	public void testMultiply() {
		int a = 3;
		int b = 15;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);

		int expected = 45;
		assertEquals(expected, actual);
	}

	@Test
	public void testDivideZero() {
		int a = 1000;
		int b = 0;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 0;
		assertEquals(expected, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 1000;
		int b = 4;

		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);

		int expected = 250;
		assertEquals(expected, actual);
	}

}
