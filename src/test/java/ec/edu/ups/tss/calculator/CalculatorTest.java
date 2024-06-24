package ec.edu.ups.tss.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void given_two_integers_when_addtion_then_ok() {
		Calculator c = new Calculator();
		int expected = 6;
		int actual = c.addition( 4, 2);
		assertEquals(expected, actual);
	}

}
