package ec.edu.ups.tss.calculator;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class CalculatorParameterTest {
	
	private int a;
	private int b;
	private int expectativa;
	
	@Parameters
	public static Iterable<Object[]> parameters(){
		List<Object[]> objects = new ArrayList<Object[]>();
		objects.add(new Object[] {2,4,6});
		objects.add(new Object[] {1,8,9});
		objects.add(new Object[] {2,5,7});
		objects.add(new Object[] {7,3,10});
		objects.add(new Object[] {22,4,26});
		objects.add(new Object[] {12,14,26});
		return objects;
	}
	
	public CalculatorParameterTest(int a, int b, int expectativa) {
		this.a = a;
		this.b = b;
		this.expectativa = expectativa;
	}
	
	@Test
	public void suma () {
		Calculator c = new Calculator();
		assertEquals(expectativa, c.suma(a, b));
	}

}
