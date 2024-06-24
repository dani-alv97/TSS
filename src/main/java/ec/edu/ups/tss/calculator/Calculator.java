package ec.edu.ups.tss.calculator;

public class Calculator {

	private int ans;

	public int suma(int a, int b) {
		return a + b;
	}

	public int resta(int a, int b) {
		return a - b;
	}

	public int division(int a, int b) {
		return a / b;
	}

	public int multiplicacion(int a, int b) {

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a * b;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}
}
