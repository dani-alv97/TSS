package ec.edu.ups.tss.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {
	
	Calculator c = null;

	@BeforeClass
	public static void setUpClass() {
		System.out.println("setUpClass");
	}

	@Before
	public void setUp() {
		System.out.println("setUp");
		c = new Calculator();
	}

	@Test
	public void suma() {
		
		System.out.println("Test 1");
		assertEquals(6, c.suma(4, 2));
		
	}

	@Test
	public void resta() {
		
		System.out.println("Test 2");
		assertEquals(2, c.resta(4, 2));
		
	}
	
	@Test(expected = ArithmeticException.class)
	public void excepcion() {
		
		System.out.println("Test 3");
		assertEquals(2, c.division(4, 0));
		
	}
	
	@Test(timeout = 250)
	public void multiplicacion() {
		
		System.out.println("Test 4");
		assertEquals(6, c.multiplicacion(3, 2));
		
	}
	
	
	@After
	public void tearDown() {
		
		System.out.println("TearDown()");
		c.setAns(0);
		c = null;
		
	}
	
	@AfterClass
	public static void tearDownClass() {
		
		System.out.println("TearDownClass()");
		
	}
	
}
