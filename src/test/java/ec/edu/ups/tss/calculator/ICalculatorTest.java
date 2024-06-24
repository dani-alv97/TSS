package ec.edu.ups.tss.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class ICalculatorTest {

	ICalculator c = null;
	
	@Before
	public void setUp() {
		c = Mockito.mock(ICalculator.class);
	}
	
	@Test
	public void  suma() {
		
		Mockito.when(c.suma(2, 3)).thenReturn(5);
		assertEquals(5, c.suma(2, 3));
		
	}
	
	@Test
	public void  resta() {
		
		Mockito.when(c.resta(5, 2)).thenReturn(3);
		assertEquals(3, c.resta(5, 2));
		
	}
	
	@Test
	public void  division() {
		
		Mockito.when(c.division(4, 2)).thenReturn(2);
		assertEquals(2, c.division(4, 2));
		
	}
	
	@Test
	public void  multiplicacion() {
		
		Mockito.when(c.multiplicacion(5, 2)).thenReturn(10);
		assertEquals(10, c.multiplicacion(5, 2));
		
	}

}
